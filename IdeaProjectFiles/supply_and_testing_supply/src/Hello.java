import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Testing Supply Constructor
        Supply test_supply = new Supply("Chicken Wings", 17);

        System.out.println("Testing if Constructor Created The Object with Right Member Variables:\n");
        // Testing The Getters
        System.out.println("Quantity Gotten: " + test_supply.getQuantity());
        System.out.println("Type Gotten: " + test_supply.getType());

        System.out.println("\n\nTesting if Setters Successfully Set the right values\n");
        int new_quantity_value = 21;
        String new_type_value = "French Vanilla";

        // Outputting Expected Values
        System.out.println("Expected Quantity Value : " + new_quantity_value);
        System.out.println("Expected Type Value : " + new_type_value + "\n");


        // Testing Setters
        test_supply.setQuantity(new_quantity_value);
        test_supply.setType(new_type_value);

        // Calling Getters to Check Setters
        System.out.println("Quantity Gotten: " + test_supply.getQuantity());
        System.out.println("Type Gotten: " + test_supply.getType());
    }
}

