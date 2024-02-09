public class Test_MedicalRecord {
    public static void main(String[] args) {
        System.out.println("Testing the Medical Record Constructor:\n");
        // Making a location object (tested in Test_Location class)
        Location test_location = new Location("test_name","test_address");
        MedicalRecord test_record = new MedicalRecord(test_location, "test_details", "test_date");

        System.out.println("Testing the Medical Record Setters and Getters:\n");
        System.out.println("This should say test_details -> " + test_record.getTreatmentDetails());
        System.out.println("This should say test_date -> " + test_record.getDateOfTreatment());

        System.out.println("Testing the Medical Record Setters and Getters:\n");
        System.out.println("\nSetting new values...\n");
        test_record.setDateOfTreatment("set_date");
        test_record.setTreatmentDetails("set_details");

        System.out.println("\nTesting getLocation() AND Accessing Location Private Members via MedicalRecord Proxy..\n");

        System.out.println("This should say set_name -> " + test_record.getLocation().getName());
        System.out.println("This should say set_address -> " + test_record.getLocation().getAddress());


        System.out.println("\n\nTesting getLocation() AND Accessing Location Private Members via MedicalRecord Proxy..\n");

        System.out.println("This should say test_name -> " + test_record.getLocation().getName());
        System.out.println("This should say test_address -> " + test_record.getLocation().getAddress());

        System.out.println("\n\nTesting the setLocation:\n");
        Location test_location2 = new Location("test_name2","test_address2");
        System.out.println("Setting new Location..\n");
        test_record.setLocation(test_location2);

        System.out.println("New Location Values:");
        System.out.println("This should say test_name2 -> " + test_record.getLocation().getName());
        System.out.println("This should say test_address2 -> " + test_record.getLocation().getAddress());

    }
}
