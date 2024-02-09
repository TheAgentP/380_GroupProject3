
public class Test_Inquirer {
    public static void main(String[] args) {

        System.out.println("Testing Inquirer Class:\n\nFirst will be testing the constructor");

        Inquirer test_inquirer = new Inquirer("Test_First_Name", "Test_Last_Name", "Test_Services_Phone", "Test_Info");

        System.out.println("\nPrinting Values..\n");
        System.out.println("This should say Test_First_Name     -> " + test_inquirer.getFirstName());
        System.out.println("This should say Test_Last_Name      -> " + test_inquirer.getLastName());
        System.out.println("This should say Test_Info           -> " + test_inquirer.getInfo());
        System.out.println("This should say Test_Services_Phone -> " + test_inquirer.getServicesPhoneNum());

        // Inquirer has no setters, so we are done with testing!

    }
}