public class Test_ReliefService {
    public static void main(String[] args) {
        Inquirer test_inquirer = new Inquirer("test_ifname", "test_ilname", "test_phone", "test_iinfo");
        DisasterVictim test_victim = new DisasterVictim("test_vfname", "test_vdate");
        Location test_location = new Location("test_name", "test_address");

        ReliefService test_service = new ReliefService("test_rdate", "test_rinfo");

        System.out.println("Testing ReliefServices Setters");
        test_service.setInquirer(test_inquirer);
        test_service.setInfoProvided("set_rinfo");
        test_service.setDateOfInquiry("set_rdate");
        test_service.setMissingPerson(test_victim);
        test_service.setLastKnownLocation(test_location);

        System.out.println("Printing String Type Members...");
        System.out.println("This should say set_rinfo    -> " + test_service.getInfoProvided());
        System.out.println("This should say set_rdate    -> " + test_service.getDateOfInquiry());

        System.out.println("\n\nPrinting Inquirer Information related to ReliefService(1)...\n");
        System.out.println("This should say test_ifname  -> " + test_service.getInquirer().getFirstName());
        System.out.println("This should say test_ilname  -> " + test_service.getInquirer().getLastName());
        System.out.println("This should say test_phone   -> " + test_service.getInquirer().getServicesPhoneNum());
        System.out.println("This should say test_iinfo   -> " + test_service.getInquirer().getInfo());

        System.out.println("\n\nPrinting missingPerson Information related to ReliefService(1)...\n");
        System.out.println("This should say test_vfname  -> " + test_service.getMissingPerson().getFirstName());
        System.out.println("This should say test_vdate   -> " + test_service.getMissingPerson().getEntry_Date());

        System.out.println("\n\nPrinting lastKnownLocation Information related to ReliefService(1)...\n");
        System.out.println("This should say test_name    -> " + test_service.getLastKnownLocation().getName());
        System.out.println("This should say test_address -> " + test_service.getLastKnownLocation().getAddress());
    }
}
