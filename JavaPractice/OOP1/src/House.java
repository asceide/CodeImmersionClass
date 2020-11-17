/*

STEP 3. Create a Custom Class (anything you want - car, phone, holiday, etc.). REQUIREMENTS:
* Minimum 3 private instance variables
* An empty constructor
* A constructor that uses only 2 of your 3 variables
* A constructor that uses all 3 of your instance variables
* Get methods for all 3 of your instance variables
* Set methods for all 3 of your instance variables
* A method that returns a Boolean A method that returns a String
For example, if I created a Santa Custom Class, my code would look something like the attached Santa.java file. Submit a link to your GitHub repository
 */
public class House {
    //Instance variables holding simple information about a house
    private String owner; //Owner of the house
    private String address;//Its address
    private double size;//The size of the house in square foot.
    private int occupants; //How many people are currently living in the house.
    //Empty/default constructor
    public House(){
        owner="City of Charlotte";
        address="123 Main St.";
        size=1000.00;
        occupants=0;
    }
    //Constructors using 2/3/4 parameters
    public House(String houseAddress, int sizeOfHouse){
        this.address=houseAddress;
        this.size=sizeOfHouse;
    }
    public House(String houseOwner, String houseAddress, double sizeOfHouse){
        this.owner=houseOwner;
        this.address=houseAddress;
        this.size=sizeOfHouse;
    }
    public House(String houseOwner, String houseAddress, double sizeOfHouse, int numberOfOccupants){
        this.owner=houseOwner;
        this.address=houseAddress;
        this.size=sizeOfHouse;
        this.occupants=numberOfOccupants;
    }
    //Getters
    public String getOwner(){
        return owner;
    }
    public String getAddress(){
        return address;
    }
    public double getSize(){
        return size;
    }
    public int getOccupants(){
        return occupants;
    }
    //Setters
    public void setOwner(String houseOwner){
        this.owner=houseOwner;
    }
    public void setAddress(String houseAddress){
        this.address=houseAddress;
    }
    public void setSize(double houseSize){
        this.size=houseSize;
    }
    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }
    //Determines if the house is empty
    public boolean isEmpty(){
        return occupants==0;
    }
    //Gives information about the house.
    public String houseInfo(){
        return String.format("This house is currently owned by %s\nIt is located at %s.\nIt is %.2f square foot in size.\nThere are currently %d people living there.", owner, address, size, occupants);
    }
}
