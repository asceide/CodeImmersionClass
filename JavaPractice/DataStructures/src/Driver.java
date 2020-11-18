/*
1.    Ask the user for 5 numbers and store them in an array list.
Then find the sum, product, largest, and smallest of those numbers.

2. You are a car dealer - create a hash map of vehicles:
The model is the Key, the make is the Value.
Ask the customer what car (model) they are looking for,
use the HashMap to determine if you have that vehicle, and what make it is.
(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")

 */
import java.util.*; //Might as well just import everything

public class Driver {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); //System input
        ArrayList<Integer> userNum = new ArrayList<>(); //ArrayList for the user numbers
        Iterator<Integer> iterate; //Iterator for tranversing the ArrayList
        HashMap<String, String> car= new HashMap<>(); //Hashmap that contains our car inventory
        int smallest=0; //numbers to hold the biggest and largest numbers in the user supplied list
        int biggest=0;
        String userInput;//For user input
        //Car Inventory
        car.put("Accord", "Honda");
        car.put("M3","BMW");
        car.put("Skyline", "Nissan");
        car.put("Jetta", "Volkswagen");
        car.put("Model S", "Tesla");
        //ArrayList part of the HW
        System.out.println("Please input five integer numbers: ");
        for(int i=0; i<5; i++) {
            userInput = input.nextLine();
            if (!userInput.matches("\\d+")) { //Validating the user's input. Must be a number.
                System.out.println("Entry was not valid, please try again: ");
                do {
                    userInput = input.nextLine();
                } while (!userInput.matches("\\d+"));
                System.out.println("Valid!");
            } else {
                userNum.add(Integer.parseInt(userInput));
            }
            System.out.println("Valid!");
        }
        //or for(int number : userNum){
        // //Do work
        //}
        iterate=userNum.iterator();
        boolean start=true; //If the List tranversal just started. For finding the min and max.
        //I know its A LOT easier to use an Enhanced For, but I want to practice using Iterator
        while(iterate.hasNext()){ //Iterates through the ArrayList
            int number=iterate.next();
            ListCalc.add(number);
            ListCalc.multi(number);
            if(start){  //If its at the start of the ArrayList
                smallest=number;
                biggest=number;
                start=false;
            }else{
                smallest=ListCalc.small(smallest,number);
                biggest=ListCalc.big(biggest,number);
            }
        }
        System.out.printf("Sum: %d, Product: %d, Smallest: %d, Largest: %d%n", ListCalc.getAddResult(), ListCalc.getProdResult(), smallest, biggest);
        //HashMap part of the hw.
        System.out.println("What is the model of the car you wish to find? ");
        userInput= input.nextLine();
        boolean found=false;
        for(Map.Entry<String, String> entry : car.entrySet()){ //Iterating through the hash map. entrySet creates a set that contains the key-value and passes that to Entry, where you can get the individual key and value
            String key = entry.getKey();
            String value = entry.getValue();
            if(userInput.equalsIgnoreCase(key)){
                found=true;
                System.out.printf("We have found a %s in our inventory. Follow your representative to go to the %s section.", key, value);
                break;
            }
        }
        if(!found){
            System.out.printf("Unforunately we do not have a %s in our inventory.", userInput);
        }
        input.close();
    }
}
