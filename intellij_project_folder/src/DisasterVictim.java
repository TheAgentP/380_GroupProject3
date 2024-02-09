import java.util.Arrays;

public class DisasterVictim {
    private String firstName, lastName, dateOfBirth, gender, comments, ENTRY_DATE;
    private int ASSIGNED_SOCIAL_ID = 17;
    private MedicalRecord[] medicalRecords = new MedicalRecord[0];
    private FamilyRelation[] familyConnections = new FamilyRelation[0];
    private Supply[] personalBelongings = new Supply[0];

    public DisasterVictim(String firstName, String ENTRY_DATE){this.firstName = firstName;this.ENTRY_DATE = ENTRY_DATE;}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getDateOfBirth() {return dateOfBirth;}

    public String getGender() {return gender;}

    public String getComments() {return comments;}

    public MedicalRecord[] getMedicalRecords(){return medicalRecords;}

    public String getEntry_Date() {return ENTRY_DATE;}

    public int getAssignedSocialId(){return ASSIGNED_SOCIAL_ID;}

    public Supply[] getPersonalBelongings() {return personalBelongings;}

    public FamilyRelation[] getFamilyConnections() {return familyConnections;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public void setGender(String gender) {this.gender = gender;}

    public void setComments(String comments) {this.comments = comments;}

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {this.medicalRecords = medicalRecords;}

    public void setPersonalBelongings(Supply[] personalBelongings) {this.personalBelongings = personalBelongings;}

    public void setFamilyConnections(FamilyRelation[] familyConnections) {this.familyConnections = familyConnections;}

    public void addSupply(Supply supply){
        personalBelongings = Arrays.copyOf(personalBelongings, personalBelongings.length + 1);
        personalBelongings[personalBelongings.length - 1] = supply;
    }

    public void removeSupply(Supply supply){
        // Finding the index for "supply" argument
        for(int i = 0; i < personalBelongings.length; i++){
            // if element was found in array
            if (personalBelongings[i] == supply) {
                // Create New Array 1 Size Smaller Than Current Array
                Supply[] temp_array = new Supply[personalBelongings.length - 1];
                // For loop that copies everything from array to temp_array except removed element
                for(int p = 0, k = 0; p < personalBelongings.length; p++){
                    if(p != i){
                        temp_array[k] = personalBelongings[p];
                        k++;
                    }
                }
                // updates array
                personalBelongings = temp_array;
                break;
            }
        }
    }

    public void addFamilyConnection(FamilyRelation familyConnection){
        familyConnections = Arrays.copyOf(familyConnections, familyConnections.length + 1);
        familyConnections[familyConnections.length - 1] = familyConnection;
    }

    public void removeFamilyConnection(FamilyRelation familyConnection){
        // Finding the index for "FamilyRelation" argument
        for(int i = 0; i < familyConnections.length; i++){
            if (familyConnections[i] == familyConnection) {
                // Create New Array 1 Size Smaller Than Current Array
                FamilyRelation[] temp_array = new FamilyRelation[familyConnections.length - 1];
                // For loop that copies everything from array to temp_array except removed element
                for(int p = 0, k = 0; p < familyConnections.length; p++){
                    if(p != i){
                        temp_array[k] = familyConnections[p];
                        k++;
                    }
                }
                // updates array
                familyConnections = temp_array;
                break;
            }
        }

    }
}
