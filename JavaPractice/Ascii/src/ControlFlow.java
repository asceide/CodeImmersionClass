import java.util.Scanner; //To use Scanner
import java.util.ArrayList; //to use ArrayList
import java.util.Random; //To get random numbers
import java.util.Arrays; //To sort the arrays
public class ControlFlow {
    public static void main(String args[]){
        Scanner input; //Scanner for input
        String userInput; //Holds the user input, need for input checking
        String userName; //Users input
        Boolean nextLoop=true;
        Random rand = new Random(); //For generating random nums
        int[] normalNum = new int[5]; //Holds the first 5 numbers
        int[] randomNum = new int[3]; //Holds the 3 randomly generated numbers
        int magicNumber; //Holds the magic number from 1-75
        ArrayList<String> userAnswers = new ArrayList<String>(); //ArrayList to hold the user's answers since I don't know if they're going to do 6 or 7 answers.
        //To be honest I should have used a LinkedList instead of ArrayList))))))))
        String[] questions={"What is the name of your favorite pet?", //Questions to ask the user
        "How old is your favorite pet?",
        "What is your lucky number?",
        "Do you have a favorite quarterback? (Enter Yes or No)",
        "What is their jersey number?",
        "What is the two-digit model year of your car?",
        "What is the first name of your favorite actor or actress?",
        "Enter a random number between 1 and 50."};
        input=new Scanner(System.in);
        System.out.print("Please input your name: ");
        userName=input.nextLine();
        //Generate the 3 random numbers
        do{
        for(int i=0; i<randomNum.length; i++){
            randomNum[i]=rand.nextInt(100)+1;
        }
        System.out.println("Please answer the following questions in order to generate your lottery fortune:");
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            userInput=input.nextLine();
            if(i==3){ //To either get 6 or 7 inputs depending if the user has a favorite QB
                AsciiChars.checkValidity(userInput,i,input); //Check if the user input is within the proper ranges
                if (userInput.equalsIgnoreCase("N") || userInput.equalsIgnoreCase("No") || userInput.matches("[Nn]o*")){
                    i=4; //If they don't, skip the next question and don't get any more info for this iteration
                    continue; //If they do, ask the next question. Either ways its needed
                }
            }else{ //Other
              //  AsciiChars.checkInput(userInput,i,input); //Check to see if the user has inputted a number for those relevant questions
                AsciiChars.checkValidity(userInput,i,input); //Check if the user input is within the proper ranges
                userAnswers.add(userInput); //Add it to the List
            }
        }
        //Get the numbers
            Boolean[] unique={false,false,false,false,false,false,false}; //To check that the same number generating parameters aren't used
            magicNumber = AsciiChars.genMagicNumber(userAnswers, randomNum); //Generate Magic Number
            for (int i = 0; i < normalNum.length; i++) {
                normalNum[i] = AsciiChars.genNormalNum(userAnswers, randomNum, unique);//Generate normal numbers
            }
            Arrays.sort(normalNum); //Sort the array
            System.out.print("Normal Numbers: "); //Present that information to the user
            for (int i = 0; i < normalNum.length; i++) {
                System.out.print(normalNum[i] + ", ");
            }
            System.out.print(" Magic Number: " + magicNumber);
            System.out.println("\nWould you like to answer the questions again to generate new numbers? ");
            userInput=input.nextLine();
            if(userInput.equalsIgnoreCase("No") || userInput.equalsIgnoreCase("N")){ //Ask if they want to generate new numbers
                nextLoop=false;
            }
        }while(nextLoop);
        input.close();
    }
}
