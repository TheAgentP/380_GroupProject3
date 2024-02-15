public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry, infoProvided;
    private Location lastKnownLocation;

    // NOTE: ReliefService doesn't have a constructor in the UML Diagram! Mistake(?)

    // Made my own constructor...
    public ReliefService(String dateOfInquiry, String infoProvided){this.dateOfInquiry = dateOfInquiry;this.infoProvided = infoProvided;}
    public ReliefService(){}

    public Inquirer getInquirer() {return inquirer;}

    public void setInquirer(Inquirer inquirer) {this.inquirer = inquirer;}

    public DisasterVictim getMissingPerson() {return missingPerson;}

    public void setMissingPerson(DisasterVictim missingPerson) {this.missingPerson = missingPerson;}

    public String getDateOfInquiry() {return dateOfInquiry;}

    public void setDateOfInquiry(String dateOfInquiry) {
        if (dateOfInquiry == null || !dateOfInquiry.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date of inquiry must be a valid date in the format YYYY-MM-DD.");
          }
          this.dateOfInquiry = dateOfInquiry;
        }

    public String getInfoProvided() {return infoProvided;}

    public void setInfoProvided(String infoProvided) {this.infoProvided = infoProvided;}

    public Location getLastKnownLocation() {return lastKnownLocation;}

    public void setLastKnownLocation(Location lastKnownLocation) {this.lastKnownLocation = lastKnownLocation;}

    public void printLogDetails() {
        System.out.println("Relief Service Inquiry Details:");
        System.out.println("Date of Inquiry: " + dateOfInquiry);
        System.out.println("Inquirer: " + (inquirer != null ? inquirer.getFirstName() + " " + inquirer.getLastName()  : "Not specified"));
        System.out.println("Missing Person: " + (missingPerson != null ? missingPerson.getFirstName() + " " + missingPerson.getLastName() : "Not specified"));
        System.out.println("Information Provided: " + infoProvided);
        System.out.println("Last Known Location: " + (lastKnownLocation != null ? lastKnownLocation.getName() : "Not specified"));
    }

    // Method to get log details as a string
    public String getLogDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relief Service Inquiry Details:\n");
        sb.append("Date of Inquiry: ").append(dateOfInquiry).append("\n");
        sb.append("Inquirer: ").append(inquirer != null ? inquirer.getFirstName() + " " + inquirer.getLastName() : "Not specified").append("\n");
        sb.append("Missing Person: ").append(missingPerson != null ? missingPerson.getFirstName() + " " + missingPerson.getLastName() : "Not specified").append("\n");
        sb.append("Information Provided: ").append(infoProvided).append("\n");
        sb.append("Last Known Location: ").append(lastKnownLocation != null ? lastKnownLocation.getName() : "Not specified").append("\n");
        return sb.toString();
    }
}
