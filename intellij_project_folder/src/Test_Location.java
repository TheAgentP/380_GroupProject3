import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

public class Test_Location {
    public static void main(String[] args) {

        System.out.println("Testing Location Class:\n\nFirst will be testing the Constructor:");

        // Constructors Called To Created Two Location Objects
        Location test_house1 = new Location("test_name1", "test_address1");

        // Testing if the Constructor Successfully created a Location Object with the correct values
        System.out.println("\nPrinting Values..\n");
        System.out.println("This should say test_name1        -> " + test_house1.getName());
        System.out.println("This should say test_address1     -> " + test_house1.getAddress());

        System.out.println("Testing The Location Class Setters");
        test_house1.setName("set_name1");
        test_house1.setAddress("set_address1");

        System.out.println("\n\nSetting New Name and Address Values..\n");

        System.out.println("Printing Values..\n");
        System.out.println("This should say set_name1        -> " + test_house1.getName());
        System.out.println("This should say set_address1     -> " + test_house1.getAddress());


        // Creating Two Supply Objects (Constructor is already tested in Test_Supply Class)
        Supply supply1 = new Supply("type1", 1);
        Supply supply2 = new Supply("type2", 2);
        Supply supply3 = new Supply("type3", 3);

        System.out.println("-----------------------------------------------------------");

        System.out.println("\nAdding Supply1, Supply2 and Supply3..\n");
        // Testing AddSupply and GetSupplies Work
        test_house1.addSupply(supply1);
        test_house1.addSupply(supply2);
        test_house1.addSupply(supply3);

        System.out.println("The Outputs should be:\n1 type1\n2 type2\n3 type3\n\nActual Output:");
        // Testing getSupplies()
        Supply[] supply_array = test_house1.getSupplies();
        for (int i = 0; i < (test_house1.getSupplies().length); i++){
            System.out.println(supply_array[i].getQuantity() + " " + supply_array[i].getType());
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("\nOutputs for Remove Supply");
        // Testing RemoveSupply
        test_house1.removeSupply(supply2);

        System.out.println("\nRemoving Supply2..\n");

        System.out.println("The Outputs should be:\n1 type1\n3 type3\n\nActual Output:");

        Supply[] supply_array1 = test_house1.getSupplies();
        for (int i = 0; i < (test_house1.getSupplies().length); i++){
            System.out.println(supply_array1[i].getQuantity() + " " + supply_array1[i].getType());
        }

        Supply supply4 = new Supply("type4", 4);
        Supply supply5 = new Supply("type5", 5);

        System.out.println("\nTesting SetSupplies...\n");
        Supply[] supply_array2 = new Supply[]{supply4, supply5};
        System.out.println("\nSetting New Supplies...\n");
        test_house1.setSupplies(supply_array2);

        System.out.println("The Outputs should be:\n4 type4\n5 type5\n\nActual Output:");
        // Testing getSupplies()
        Supply[] supply_array3 = test_house1.getSupplies();
        for (int i = 0; i < (test_house1.getSupplies().length); i++){
            System.out.println(supply_array3[i].getQuantity() + " " + supply_array3[i].getType());
        }

        // Creating 5 DisasterVictim Objects then Two Arrays
        DisasterVictim test_victim1 = new DisasterVictim("name1", "entry1");
        DisasterVictim test_victim2 = new DisasterVictim("name2", "entry2");
        DisasterVictim test_victim3 = new DisasterVictim("name3", "entry3");
        DisasterVictim test_victim4 = new DisasterVictim("name4", "entry4");
        DisasterVictim test_victim5 = new DisasterVictim("name5", "entry5");

        DisasterVictim[] victim_array1 = new DisasterVictim[]{test_victim1, test_victim2, test_victim3};
        DisasterVictim[] victim_array2 = new DisasterVictim[]{test_victim4, test_victim5};


        System.out.println("\n\nTesting setOccupants and getOccupants, Also Testing out Aggregation Relationship between Location and DisasterVictim\n");
        System.out.println("Expected Output:\nname1 entry1\nname2 entry2\nname3 entry3\n");
        test_house1.setOccupants(victim_array1);
        for(int i = 0; i < test_house1.getOccupants().length; i++){
            System.out.println(test_house1.getOccupants()[i].getFirstName() + " " + test_house1.getOccupants()[i].getEntry_Date());
        }

        System.out.println("\n\nTesting Replacing the Existing FamilyRelation Array in Location(1) with a New One\n");
        test_house1.setOccupants(victim_array2);
        System.out.println("Expected Output:\nname4 entry4\nname5 entry5\n");
        System.out.println("Actual Output:");
        for(int i = 0; i < test_house1.getOccupants().length; i++){
            System.out.println(test_house1.getOccupants()[i].getFirstName() + " " + test_house1.getOccupants()[i].getEntry_Date());
        }

        System.out.println("\n\nTesting addOccupant and removeOccupant\n");
        System.out.println("\nRemoving occupant5, Adding occupant1...\n");
        test_house1.removeOccupant(test_victim5);
        test_house1.addOccupant(test_victim1);

        System.out.println("Expected Output:\nname4 entry4\nname1 entry1\n");
        System.out.println("Actual Output:");
        for(int i = 0; i < test_house1.getOccupants().length; i++){
            System.out.println(test_house1.getOccupants()[i].getFirstName() + " " + test_house1.getOccupants()[i].getEntry_Date());
        }
    }
}
