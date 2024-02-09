public class Test_FamilyRelation {
    public static void main(String[] args) {
        System.out.println("Testing FamilyRelation Constructor Class:");
        // Creating DisasterVictim Objects
        DisasterVictim test_victim1 = new DisasterVictim("name1", "entry1");
        DisasterVictim test_victim2 = new DisasterVictim("name2", "entry2");
        DisasterVictim test_victim3 = new DisasterVictim("name3", "entry3");
        DisasterVictim test_victim4 = new DisasterVictim("name4", "entry4");

        FamilyRelation test_relation = new FamilyRelation(test_victim1, "test_relation1", test_victim2);

        System.out.println("Testing if Constructor Created The Object with Right Member Variables:\n");
        System.out.println("Expected Output:\nname1 entry1\ntest_relation1\nname2 entry2\n\nActual Output:");
        System.out.println(test_relation.getPersonOne().getFirstName() + " " + test_relation.getPersonOne().getEntry_Date());
        System.out.println(test_relation.getRelationshipTo());
        System.out.println(test_relation.getPersonTwo().getFirstName() + " " + test_relation.getPersonTwo().getEntry_Date());

        System.out.println("\nTesting FamilyRelation Setters:\n");
        test_relation.setPersonOne(test_victim3);
        test_relation.setRelationshipTo("test_relation2");
        test_relation.setPersonTwo(test_victim4);
        System.out.println("Expected Output:\nname3 entry3\ntest_relation2\nname4 entry4\n\nActual Output:");
        System.out.println(test_relation.getPersonOne().getFirstName() + " " + test_relation.getPersonOne().getEntry_Date());
        System.out.println(test_relation.getRelationshipTo());
        System.out.println(test_relation.getPersonTwo().getFirstName() + " " + test_relation.getPersonTwo().getEntry_Date());


    }
}
