public class Test_DisasterVictim {
    public static void main(String[] args) {
        System.out.println("Testing DisasterVictim Constructor Class:");

        DisasterVictim test_victim = new DisasterVictim("test_first_name", "test_entry_date");

        System.out.println("\nTesting Outputs..\n");
        System.out.println("This should say test_first_name      -> " + test_victim.getFirstName());
        System.out.println("This should say test_entry_date      -> " + test_victim.getEntry_Date());

        System.out.println("\n\nTesting DisasterVictim Setter/Getter Classes:");

        test_victim.setComments("set_comment");
        test_victim.setDateOfBirth("set_date");
        test_victim.setGender("set_gender");
        test_victim.setFirstName("set_first_name");
        test_victim.setLastName("set_last_name");

        System.out.println("\nTesting Outputs..\n");
        System.out.println("This should say set_comment         -> " + test_victim.getComments());
        System.out.println("This should say set_date            -> " + test_victim.getDateOfBirth());
        System.out.println("This should say set_gender          -> " + test_victim.getGender());
        System.out.println("This should say set_first_name      -> " + test_victim.getFirstName());
        System.out.println("This should say set_last_name       -> " + test_victim.getLastName());
// NOTE: THERE IS NO setAssignedSocialID() in the UML Diagram.... Mistake by TA?
        System.out.println("This should say 17                  -> " + test_victim.getAssignedSocialId());



        // Creating 3 Disaster Victims then Creating 3 FamilyRelations
        DisasterVictim test_victim1 = new DisasterVictim("name1", "entry1");
        DisasterVictim test_victim2 = new DisasterVictim("name2", "entry2");
        DisasterVictim test_victim3 = new DisasterVictim("name3", "entry3");
        DisasterVictim test_victim4 = new DisasterVictim("name4", "entry4");

        FamilyRelation test_relation1 = new FamilyRelation(test_victim1, "relationship1", test_victim2);
        FamilyRelation test_relation2 = new FamilyRelation(test_victim3, "relationship2", test_victim4);
        FamilyRelation test_relation3 = new FamilyRelation(test_victim2, "relationship3", test_victim3);

        // Creating 5 Different Objects for each Supply, Location, and Medical Record
        Supply test_supply1 = new Supply("Type1", 1);Location test_location1 = new Location("name1", "address1");MedicalRecord test_record1 = new MedicalRecord(test_location1, "detail1", "date1");
        Supply test_supply2 = new Supply("Type2", 2);Location test_location2 = new Location("name2", "address2");MedicalRecord test_record2 = new MedicalRecord(test_location2, "detail2", "date2");
        Supply test_supply3 = new Supply("Type3", 3);Location test_location3 = new Location("name3", "address3");MedicalRecord test_record3 = new MedicalRecord(test_location3, "detail3", "date3");
        Supply test_supply4 = new Supply("Type4", 4);Location test_location4 = new Location("name4", "address4");MedicalRecord test_record4 = new MedicalRecord(test_location4, "detail4", "date4");
        Supply test_supply5 = new Supply("Type5", 5);Location test_location5 = new Location("name5", "address5");MedicalRecord test_record5 = new MedicalRecord(test_location5, "detail5", "date5");

        // Creating Two Different Arrays of MedicalRecord, FamilyRelation, and Supply

        MedicalRecord[] medical_array1 = new MedicalRecord[]{test_record1, test_record2, test_record3};
        MedicalRecord[] medical_array2 = new MedicalRecord[]{test_record4, test_record5};

        FamilyRelation[] relation_array1 = new FamilyRelation[]{test_relation1, test_relation2};
        FamilyRelation[] relation_array2 = new FamilyRelation[]{test_relation3};

        Supply[] supply_array1 = new Supply[]{test_supply1, test_supply2, test_supply3};
        Supply[] supply_array2 = new Supply[]{test_supply4, test_supply5};

        /*----------------------------------------------------------------- FamilyRelation Array Testing ------------------------------------------------------------------*/
        System.out.println("\n\nTesting setFamilyConnections and getFamilyConnections, Also Testing out the Relationship between FamilyRelation and DisasterVictim\n");
        test_victim.setFamilyConnections(relation_array1);
        System.out.println("Expected Output:\nrelationship1\nrelationship2\n");
        System.out.println("Actual Output:");
        for(int i = 0; i < test_victim.getFamilyConnections().length; i++){
            System.out.println(test_victim.getFamilyConnections()[i].getRelationshipTo());
        }

        System.out.println("\n\nTesting Replacing the Existing FamilyRelation Array in DisasterVictim(1) with a New One\n");
        test_victim.setFamilyConnections(relation_array2);
        System.out.println("Expected Output:\nrelationship3\n");
        System.out.println("Actual Output:");
        for(int i = 0; i < test_victim.getFamilyConnections().length; i++){
            System.out.println(test_victim.getFamilyConnections()[i].getRelationshipTo());
        }

        System.out.println("\n\nTesting addFamilyConnection and removeFamilyConnection\n");

        System.out.println("\nRemoving relation3, Adding relation2, Adding relation1..\n");
        test_victim.removeFamilyConnection(test_relation3);
        test_victim.addFamilyConnection(test_relation2);
        test_victim.addFamilyConnection(test_relation1);
        System.out.println("Expected Output:\nrelationship2\nrelationship1\n");
        System.out.println("Actual Output:");
        for(int i = 0; i < test_victim.getFamilyConnections().length; i++){
            System.out.println(test_victim.getFamilyConnections()[i].getRelationshipTo());
        }

        /*----------------------------------------------------------------- MedicalRecords Array Testing ------------------------------------------------------------------*/

        System.out.println("\n\nTesting setMedicalRecords and getMedicalRecords, Also Testing out the Relationship between MedicalRecord and DisasterVictim\n");
        test_victim.setMedicalRecords(medical_array1);
        System.out.println("Expected Output:\ndate1 detail1\ndate2 detail2\ndate3 detail3\n");
        System.out.println("Actual Output:");
        for(int i = 0; i < test_victim.getMedicalRecords().length; i++){
            System.out.println(test_victim.getMedicalRecords()[i].getDateOfTreatment() + " " + test_victim.getMedicalRecords()[i].getTreatmentDetails());
        }

        System.out.println("\n\nTesting Replacing the Existing MedicalArray in DisasterVictim(1) with a New One\n");
        test_victim.setMedicalRecords(medical_array2);
        System.out.println("Expected Output:\ndate4 detail4\ndate5 detail5\n");
        System.out.println("Actual Output:");
        for(int i = 0; i < test_victim.getMedicalRecords().length; i++){
            System.out.println(test_victim.getMedicalRecords()[i].getDateOfTreatment() + " " + test_victim.getMedicalRecords()[i].getTreatmentDetails());
        }

        /*----------------------------------------------------------------- Supply Array Testing ------------------------------------------------------------------*/
        System.out.println("\n\nTesting setPersonalBelongings and getPersonalBelongings, Also Testing out Composition Relationship between Supply and DisasterVictim\n");
        System.out.println("Expected Output:\n1 Type1\n2 Type2\n3 Type3\n");
        test_victim.setPersonalBelongings(supply_array1);
        System.out.println("Actual Output:");
        for(int i = 0; i < test_victim.getPersonalBelongings().length; i++){
            System.out.println(test_victim.getPersonalBelongings()[i].getQuantity() + " " + test_victim.getPersonalBelongings()[i].getType());
        }

        System.out.println("\n\nTesting Replacing the Existing Supply Array in DisasterVictim(1) with a New One\n");
        test_victim.setPersonalBelongings(supply_array2);
        System.out.println("Expected Output:\n4 Type4\n5 Type5\n");
        System.out.println("Actual Output:");
        for(int i = 0; i < test_victim.getPersonalBelongings().length; i++){
            System.out.println(test_victim.getPersonalBelongings()[i].getQuantity() + " " + test_victim.getPersonalBelongings()[i].getType());
        }

        System.out.println("\n\nTesting addSupply and removeSuppy\n");
        test_victim.removeSupply(test_supply5);
        test_victim.addSupply(test_supply1);
        System.out.println("\nRemoving supply5, Adding relation1...\n");
        System.out.println("Expected Output:\n4 Type4\n1 Type1\n");
        System.out.println("Actual Output:");
        for(int i = 0; i < test_victim.getPersonalBelongings().length; i++){
            System.out.println(test_victim.getPersonalBelongings()[i].getQuantity() + " " + test_victim.getPersonalBelongings()[i].getType());
        }

    }
}
