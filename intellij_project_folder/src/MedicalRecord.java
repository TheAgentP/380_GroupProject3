public class MedicalRecord {
    private Location location;
    private String treatmentDetails, dateOfTreatment;
    private DisasterVictim victim;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment){
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }
    public MedicalRecord(){};

    public DisasterVictim getVictim() {
        return victim;
    }

    public void setVictim(DisasterVictim victim) {
        this.victim = victim;
    }

    public Location getLocation(){return location;}

    public void setLocation(Location location){this.location = location;}

    public String getDateOfTreatment() {return dateOfTreatment;}

    public String getTreatmentDetails() {return treatmentDetails;}

    public void setDateOfTreatment(String dateOfTreatment) {this.dateOfTreatment = dateOfTreatment;}

    public void setTreatmentDetails(String treatmentDetails) {
    if (treatmentDetails == null || treatmentDetails.isEmpty()) {
        throw new IllegalArgumentException("Treatment details must be provided.");
    }
    this.treatmentDetails = treatmentDetails;
    }
}
