import java.util.Arrays;

public class Location {
    private String name, address;
    // private []DisasterVictim occupants;
    private Supply[] supplies = new Supply[4];

    public Location(String Name, String Address){
        name = Name;
        address = Address;
    }

    public String getName(){return name;}

    public void setName(String Name) {this.name = Name;}

    public String getAddress(){return address;}

    public void setAddress(String Address) {address = Address;}

    // setOccupants()

    // getOccupants()


    public Supply[] getSupplies() {return supplies;}

    public void setSupplies(Supply[] Supplies) {supplies = Supplies;}

    // addOccupant()

    // removeOccupant()

    public void addSupply(Supply supply){supplies.push(supply);}

    public void removeSupply(Supply supply){
        for (int i = 0; i < supplies.length; i++){
            if (supplies[i] == supply) {
                supplies.splice(i, i);
            }
        }
    }

    //updateLog(String Name, String Address)
}
