import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class ControlFlow {
    public static void main(String args[]){
        Scanner input; //Scanner for input
        String userInput; //Holds the user input, need for input checking
        String userName; //Users input
        Random rand = new Random(); //For generating random nums
        int[] normalNum = new int[5]; //Holds the first 5 numbers
        int[] randomNum = new int[3]; //Holds the 3 randomly generated numbers
        int magicNumber; //Holds the magic number from 1-75
        ArrayList<String> userAnswers = new ArrayList<String>(); //ArrayList to hold the user's answers since I don't know if they're going to do 6 or 7 answers.
        String[] questions={"What is the name of your favorite pet?", //Questions to ask the user
        "How old is your favorite pet?",
        "What is your lucky number?",
        "Do you have a favorite quarterback? (Enter Yes or No)",
        "What is their jersey number?",
        "What is the two-digit model year of your car?",
        "What is the first name of your favorite actor or actress?",
        "Enter a random number between 1 and 50."};
        //Generate the 3 random numbers
        for(int i=0; i<randomNum.length; i++){
            randomNum[i]=rand.nextInt(100)+1;
        }
        input=new Scanner(System.in);
        System.out.print("Please input your name: ");
        userName=input.nextLine();
        System.out.println("Please answer the following questions in order to generate your lottery fortune:");
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            userInput=input.nextLine();
            if(i==3){ //To either get 6 or 7 inputs depending if the user has a favorite QB
                if (userInput.equalsIgnoreCase("N") || userInput.equalsIgnoreCase("No")){
                    i=4; //If they don't, skip the next question and don't get any more info for this iteration
                    continue; //If they do, ask the next question. Either ways its needed
                }
            }else{ //Other
                userAnswers.add(userInput);
            }
        }
        //Get the magic number
        if(userAnswers.size()==6){
            magicNumber=AsciiChars.genMagicNumber(userAnswers.get(3),randomNum[rand.nextInt(3)]);
        }else{
            magicNumber=AsciiChars.genMagicNumber(userAnswers.get(2),randomNum[rand.nextInt(3)]);
        }
        System.out.println(magicNumber);
        int counter=0;
        for(int i=0; i<normalNum.length; i++){
            normalNum[i]=AsciiChars.genNormalNum(userAnswers, randomNum);
        }
        input.close();
    }
}
