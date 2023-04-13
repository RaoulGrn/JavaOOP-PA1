public class MultiPurpose extends Ship{
    private int maxNumberOfContainers;

    public MultiPurpose(int maxNumberOfContainers) {
        this.maxNumberOfContainers = maxNumberOfContainers;
    }

    public int getMaxNumberOfContainers() {
        return maxNumberOfContainers;
    }

    @Override
    public boolean isReadyForDeparture() {
        return maxNumberOfContainers >= getCargoList().size() && hasValidContainers();
    }
}
