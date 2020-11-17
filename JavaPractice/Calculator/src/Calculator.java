public class Calculator {
    protected static double result;

    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int subtract(int num1, int num2){
        return num1-num2;
    }
    public static int multiply(int num1, int num2){
        return num1*num2;
    }
    public static int divide(int num1, int num2){
        return Math.floorDiv(num1,num2);
    }
    public static int square(int num){
        return num*num;
    }
}
