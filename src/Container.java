public class Container {
    private ContainerType containerType;
    private String certificate;
    private int capacity;
    private boolean isValid;

    public Container(ContainerType containerType, String certificate, int capacity ,boolean isValid) {
        this.containerType = containerType;
        this.certificate = certificate;
        this.capacity = capacity;
        this.isValid = isValid;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public String getCertificate() {
        return certificate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void validateCertificate(){
           isValid = true;
    }

    public boolean isValid() {
        return isValid;
    }
}
