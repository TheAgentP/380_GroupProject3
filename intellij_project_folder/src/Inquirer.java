import java.security.PublicKey;

public class Inquirer {
    private String FIRST_NAME, LAST_NAME, INFO, SERVICES_PHONE;

    public Inquirer(String fname, String lname, String phone, String info){
        FIRST_NAME = fname;
        LAST_NAME = lname;
        SERVICES_PHONE = phone;
        INFO = info;
    }

    public String getFirstName() {return FIRST_NAME;}

    public String getLastName() {return LAST_NAME;}

    public String getInfo() {return INFO;}

    public String getServicesPhoneNum() {return SERVICES_PHONE;}


}
