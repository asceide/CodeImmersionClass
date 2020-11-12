import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class AsciiChars {
//Imagine Mapping the ASCII table when you can just assign a char to an integer and get what you need anyways lmao
    public static void printNumbers(){
        char ascii;
        for(int i=48; i<=57; i++){
            ascii=(char) i;
            System.out.print(ascii+", ");
        }
    }
    public static void printLowerCase(){
        char ascii;
        for(int i=97; i<=122; i++){
            ascii=(char) i;
            System.out.print(ascii+", ");
        }

    }
    public static void printUpperCase(){
        char ascii;
        for(int i=65; i<=90; i++){
            ascii=(char) i;
            System.out.print(ascii+", ");
        }
    }
    public static int convertToAscii(String input, int type){
        int ascii=0;

        return ascii;
    }
    public static int genMagicNumber(String input, int ranNum){
        final int MAX_MAGIC_NUMBER=75;
        int magicNum=Integer.parseInt(input)*ranNum;
        while(magicNum>MAX_MAGIC_NUMBER){
            magicNum-=75;
        }
        return magicNum;
    }
    public static int genNormalNum(ArrayList<String> answers, int[] ranNum){
        final int MIN_NORMAL_NUMBER=1;
        final int MAX_NORMAL_NUMBER=65;
        int number=0;

        return number;
    }
}
