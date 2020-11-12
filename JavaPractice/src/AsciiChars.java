import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AsciiChars {
    //Imagine Mapping the ASCII table when you can just assign a char to an integer and get what you need anyways lmao
    final private static int MIN_NORMAL_NUMBER = 1;
    final private static int MAX_NORMAL_NUMBER = 65;
    final private static int MAX_MAGIC_NUMBER = 75;
    private static Random whichNum = new Random();

    public static void printNumbers() {
        char ascii;
        for (int i = 48; i <= 57; i++) {
            ascii = (char) i;
            System.out.print(ascii + ", ");
        }
    }

    public static void printLowerCase() {
        char ascii;
        for (int i = 97; i <= 122; i++) {
            ascii = (char) i;
            System.out.print(ascii + ", ");
        }

    }

    public static void printUpperCase() {
        char ascii;
        for (int i = 65; i <= 90; i++) {
            ascii = (char) i;
            System.out.print(ascii + ", ");
        }
    }

    public static int convertToAscii(String input, int type) {
        int ascii = 0;

        return ascii;
    }

    /*
        Method: genMagicNumber
        Parameters: ArrayList<String>, int[]
        Return: int
        Purpose: Generates a magic number based on the answers of either the user's lucky number or quarterback jersey number, multiplied by a random number
     */
    public static int genMagicNumber(ArrayList<String> answers, int[] ranNum) {
        int magicNum = 0;
        if (answers.size() == 6) { //Checks to see if the user has a quarterback number or not
            magicNum = (Integer.parseInt(answers.get(2))) * ranNum[whichNum.nextInt(ranNum.length)];
        } else {
            magicNum = (Integer.parseInt(answers.get(3))) * ranNum[whichNum.nextInt(ranNum.length)];
        }
        while (magicNum > MAX_MAGIC_NUMBER) { //To check if the number is out of range
            magicNum = boundCorrect(magicNum, 0);
        }
        return magicNum;
    }

    /*
        Method: genNormalNum
        Parameters: ArrayList<String>, int[], Boolean[]
        Return: int
        Purpose: Generates 5 random numbers for the user based on their answers
     */
    public static int genNormalNum(ArrayList<String> answers, int[] ranNum, Boolean[] uniq) {
        int number = 0;
        int choice = 0;
        if (answers.size() == 6) { //Checks if the user has a favorite quarterback or not
            choice = whichNum.nextInt(6);
            while (uniq[choice]) { //Checks if the random choice to generate the number hasn't been used before.
                choice = whichNum.nextInt(6);
            }
            uniq[choice] = true;
        } else {
            choice = whichNum.nextInt(7);
            while (uniq[choice]) {
                choice = whichNum.nextInt(7);
            }
            uniq[choice] = true;
        }
        switch (choice) { //Generates numbers based on user answers. Which parameters are used for the generation is random
            case 0:
                number = answers.get(0).charAt(2); //Generates a number based on the decimal value of the character of the 3rd letter in their favorite pets name
                break;
            case 1:
                if (answers.size() == 6) { //There is going to be constant checks because index positions depend on whether the user has a favorite quarterback or not
                    number = (Integer.parseInt(answers.get(3))) + (Integer.parseInt(answers.get(2))); //Based on the their car model year and lucky num
                } else {
                    number = (Integer.parseInt(answers.get(4))) + (Integer.parseInt(answers.get(2)));
                }
                break;
            case 2:
                if (answers.size() == 6) {
                    number = (Integer.parseInt(answers.get(5))) - ranNum[whichNum.nextInt(ranNum.length)]; //Based on their randomly chosen number and random number
                } else {
                    number = (Integer.parseInt(answers.get(6))) - ranNum[whichNum.nextInt(ranNum.length)];
                }
                break;
            case 3:
                if (answers.size() == 6) {
                    number = answers.get(4).charAt(0); //Based on the first letter of their favorite actors/actress' name
                } else {
                    number = answers.get(5).charAt(0);
                }
                break;
            case 4:
                if (answers.size() == 6) {
                    int nameLength = answers.get(4).length() - 1; //Based on the last letter of their favorite actors/actress' name
                    number = answers.get(4).charAt(nameLength);
                } else {
                    int nameLength = answers.get(5).length() - 1;
                    number = answers.get(5).charAt(nameLength);
                }
                break;
            case 5:
                number = 42; //Just the number 42 lol
                break;
            case 6:
                if (answers.size() == 6) {
                    number = (Integer.parseInt(answers.get(1))) + (Integer.parseInt(answers.get(3))); //Based on the age of their pet and their car model year
                } else {
                    number = (Integer.parseInt(answers.get(1))) + (Integer.parseInt(answers.get(4)));
                }
                break;
            case 7:
                number = (Integer.parseInt(answers.get(3))) + (Integer.parseInt(answers.get(1))) + (Integer.parseInt(answers.get(2))); //Based on their QB jersey number and age of pet and lucky number
                break;
            default:
                number = 1;
        }
        while (number < MIN_NORMAL_NUMBER || number > MAX_NORMAL_NUMBER) { //Bound checking
            if (number < MIN_NORMAL_NUMBER) {
                number = boundCorrect(number, 1);
            } else {
                number = boundCorrect(number, 2);
            }
        }
        return number;
    }

    private static int boundCorrect(int num, int type) { //Checking bounds for magic numbers and normal numbers
        int number = num;
        if (type == 0) {
            number -= 75;
        } else if (type == 1) {
            number += 65;
        } else {
            number -= 65;
        }

        return number;
    }

    public static void checkInput(String input, int qNum, Scanner scan) {
        String temp;
        if (qNum == 1 || qNum == 2 || qNum == 4 || qNum == 5 || qNum == 7) {
            try {
                Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("You have not inputted a valid number. Please try again.");
                temp = scan.nextLine();
                checkInput(temp, qNum, scan);
            }
        }
    }

    public static void checkValidity(String input, int qNum, Scanner scan) {
        String temp;
        int tempNum = 0;
        switch (qNum) {
            case 5:
                tempNum = Integer.parseInt(input);
                if (tempNum < 0 || tempNum > 99) {
                    do {
                        System.out.println("Model year is not valid. Please select from 00 to 99");
                        temp = scan.nextLine();
                        checkInput(temp, qNum, scan);
                        tempNum = Integer.parseInt(temp);
                    } while (tempNum < 0 || tempNum > 99);
                    input = temp;
                }
                break;
            case 6:
                if (input.length() < 3) {
                    do {
                        System.out.println("Please input a name of at least 3 characters in length: ");
                        temp = scan.nextLine();
                    } while (input.length() < 3);
                    input = temp;
                }
                break;
            case 7:
                tempNum = Integer.parseInt(input);
                if (tempNum < 1 || tempNum > 50) {
                    do {
                        System.out.println("Random number is out of range. Please select a number between 1 and 50");
                        temp = scan.nextLine();
                        checkInput(temp, qNum, scan);
                        tempNum = Integer.parseInt(temp);
                    } while (tempNum < 1 || tempNum > 50);
                    input = temp;
                }
                break;
            default:
                break;
        }
    }
}