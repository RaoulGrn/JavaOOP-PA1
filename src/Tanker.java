public class Tanker extends Ship{
    private int maxCargoVolume;

    public Tanker(int maxCargoVolume) {
        this.maxCargoVolume = maxCargoVolume;
    }

    @Override
    public void addToCargoList(Container c) {
        if(c.getContainerType().equals(ContainerType.LIQUID)){
            super.addToCargoList(c);
        }
    }

    @Override
    public boolean isReadyForDeparture() {
        int sumOfCargo = getCargoList().stream().mapToInt(Container::getCapacity).sum();
        return sumOfCargo < maxCargoVolume && hasValidContainers();
    }

    public int getMaxCargoVolume() {
        return maxCargoVolume;
    }
}
