public class Main {
    public static void main(String[] args) {
            Customs customs = new Customs();

            Reefer reefer = new Reefer(15,-25);
            Tanker tanker = new Tanker(15);
            MultiPurpose multiPurpose = new MultiPurpose(2);

            Container container1 = new Container(ContainerType.FROZEN_FOOD,"CertificateX",2,true);
            Container container2= new Container(ContainerType.LIQUID,"CertificateY",5,false);
        Container container3 = new Container(ContainerType.FROZEN_FOOD,"CertificateX",12,true);
        Container container4= new Container(ContainerType.LIQUID,"CertificateY",5,false);
        Container container6 = new Container(ContainerType.PACKAGE,"CertificateX",5,true);
        Container container7= new Container(ContainerType.PACKAGE,"CertificateY",5,false);

        reefer.addToCargoList(container1);
        reefer.addToCargoList(container3);

        tanker.addToCargoList(container2);
        tanker.addToCargoList(container4);

        multiPurpose.addToCargoList(container6);
        multiPurpose.addToCargoList(container7);

        customs.addToShipList(reefer);
        customs.addToShipList(tanker);
        customs.addToShipList(multiPurpose);

        container2.validateCertificate();
        container4.validateCertificate();
        container7.validateCertificate();



        System.out.println(customs.logCheck());

    }
}
