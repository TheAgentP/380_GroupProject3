import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hello {
    public static void main(String[] args) {

        // Constructor Called
        Location test_house = new Location("T-House", "Somewhere in ValleyView");

        // Testing if the Constructor Successfully created a Location Object with the correct values
        System.out.println("Set Name: " + test_house.getName() + "\n" + "Set Address: " + test_house.getAddress());
    }
}

