public class Reefer extends Ship{

    private int maxCargoWeight;
    private int minTemp;



    public Reefer(int maxCargoWeight, int minTemp) {
        this.maxCargoWeight = maxCargoWeight;
        this.minTemp = minTemp;
    }

    @Override
    public void addToCargoList(Container c) {
        if(c.getContainerType().equals(ContainerType.FROZEN_FOOD)){
            super.addToCargoList(c);
        }
    }

    @Override
    public boolean isReadyForDeparture() {
            int sumOfCargo = getCargoList().stream().mapToInt(Container::getCapacity).sum();
        System.out.println(sumOfCargo);
        return sumOfCargo < maxCargoWeight && minTemp <= -18 && minTemp >= -25 && hasValidContainers() ;
    }



    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public int getMinTemp() {
        return minTemp;
    }
}
