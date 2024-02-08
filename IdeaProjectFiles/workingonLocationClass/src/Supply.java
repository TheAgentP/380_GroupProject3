import java.util.Arrays;

public class Supply {
    private String type;
    private int quantity;

    // Constructor ( Should We Make a Default Constructor
    public Supply(String Type, int Quantity){
        type = Type;
        quantity = Quantity;
    }

    public String getType(){return type;}

    public void setType(String Type){type = Type;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int Quantity){quantity = Quantity;}

}

/*
private String StringArray[] = new String[4];

public SimpleArrays(String StringArg) {
    Arrays.fill(StringArray, StringArg);
}

public SimpleArrays() {
    Arrays.fill(StringArray, "Hello World");
}

public String arrayConcat() {
    return arrayConcat(0);
}
*/
