import java.util.Arrays;

public class Location {
    private String name, address;
    // private []DisasterVictim occupants;
    private Supply[] supplies = new Supply[0];
    private DisasterVictim[] occupants = new DisasterVictim[0];

    public Location(String Name, String Address){
        name = Name;
        address = Address;
    }

    public String getName(){return name;}
    public void setName(String Name) {this.name = Name;}
    public String getAddress(){return address;}
    public void setAddress(String Address) {address = Address;}

    public DisasterVictim[] getOccupants() {return occupants;}

    public void setOccupants(DisasterVictim[] occupants){this.occupants = occupants;}

    public void addOccupant(DisasterVictim occupant){
        occupants = Arrays.copyOf(occupants, occupants.length + 1);
        occupants[occupants.length - 1] = occupant;
    }

    public void removeOccupant(DisasterVictim occupant){
        // Finding the index for "supply" argument
        for(int i = 0; i < occupants.length; i++){
            // if element was found in array
            if (occupants[i] == occupant) {
                // Create New Array 1 Size Smaller Than Current Array
                DisasterVictim[] temp_array = new DisasterVictim[occupants.length - 1];
                // For loop that copies everything from array to temp_array except removed element
                for(int p = 0, k = 0; p < occupants.length; p++){
                    if(p != i){
                        temp_array[k] = occupants[p];
                        k++;
                    }
                }
                // updates array
                occupants = temp_array;
                break;
            }
        }
    }

    public Supply[] getSupplies() {return supplies;}

    public void setSupplies(Supply[] Supplies) {supplies = Supplies;}

    public void addSupply(Supply supply){
        supplies = Arrays.copyOf(supplies, supplies.length + 1);
        supplies[supplies.length - 1] = supply;
    }


    public void removeSupply(Supply supply){
        // Finding the index for "supply" argument
        for(int i = 0; i < supplies.length; i++){
            // if element was found in array
            if (supplies[i] == supply) {
                // Create New Array 1 Size Smaller Than Current Array
                Supply[] temp_array = new Supply[supplies.length - 1];
                // For loop that copies everything from array to temp_array except removed element
                for(int p = 0, k = 0; p < supplies.length; p++){
                    if(p != i){
                        temp_array[k] = supplies[p];
                        k++;
                    }
                }
                // updates array
                supplies = temp_array;
                break;
            }
        }

    }



    //public void updateLog(String Name, String Address) still needs to be defined
}
