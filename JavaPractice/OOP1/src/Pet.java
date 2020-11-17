/*
    Create a Pet Class with the following instance variables:
 name (PRIVATE)
age (PRIVATE)
location (PRIVATE)
type (PRIVATE)
and two constructors. Empty all attributes.
STEP 1. Code to be able to access the following (Get Methods): name, age, and type
STEP 2. Code to be able to change the following methods (Set Methods): name, age, location
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

public class Pet {
    //Private instance variables
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet(){}//Empty/default constructor
    public Pet(String petName, int petAge, String petLocation, String petType){ //Constructor
        this.name=petName;
        this.age=petAge;
        this.location=petLocation;
        this.type=petType;
    }
    //Getters for pet name, age, and type
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getType(){
        return type;
    }
    //Setters for pet name,age, and location
    public void setName(String petName){
        this.name=petName;
    }
    public void setAge(int petAge){
        this.age=petAge;
    }
    public void setLocation(String petLocation){
        this.location=petLocation;
    }
}
