public class MedicalRecord {
    private Location location;
    private String treatmentDetails, dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment){
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }
    // getVictim
    // setVictim
    public Location getLocation(){return location;}

    public void setLocation(Location location){this.location = location;}

    public String getDateOfTreatment() {return dateOfTreatment;}

    public String getTreatmentDetails() {return treatmentDetails;}

    public void setDateOfTreatment(String dateOfTreatment) {this.dateOfTreatment = dateOfTreatment;}

    public void setTreatmentDetails(String treatmentDetails) {this.treatmentDetails = treatmentDetails;}
}
