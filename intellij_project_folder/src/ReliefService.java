public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry, infoProvided;
    private Location lastKnownLocation;

    // NOTE: ReliefService doesn't have a constructor in the UML Diagram! Mistake(?)

    // Made my own constructor...
    public ReliefService(String dateOfInquiry, String infoProvided){this.dateOfInquiry = dateOfInquiry;this.infoProvided = infoProvided;}

    public Inquirer getInquirer() {return inquirer;}

    public void setInquirer(Inquirer inquirer) {this.inquirer = inquirer;}

    public DisasterVictim getMissingPerson() {return missingPerson;}

    public void setMissingPerson(DisasterVictim missingPerson) {this.missingPerson = missingPerson;}

    public String getDateOfInquiry() {return dateOfInquiry;}

    public void setDateOfInquiry(String dateOfInquiry) {this.dateOfInquiry = dateOfInquiry;}

    public String getInfoProvided() {return infoProvided;}

    public void setInfoProvided(String infoProvided) {this.infoProvided = infoProvided;}

    public Location getLastKnownLocation() {return lastKnownLocation;}

    public void setLastKnownLocation(Location lastKnownLocation) {this.lastKnownLocation = lastKnownLocation;}

    // public void printLogDetails() still needs to be defined

    // public String getLogDetails() still needs to be defined
}
