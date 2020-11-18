public class ListCalc {
    private static int addResult=0;
    private static int prodResult=1;

    //Sums up the numbers in the ArrayList
    public static void add(int num){
        addResult+=num;
    }
    //Multiplys them
    public static void multi(int num){
        prodResult*=num;
    }
    //Method to see if a number is smaller than the other
    public static int small(int num, int num2){
        return Math.min(num, num2);
    }
    //Same for if a number is larger
    public static int big(int num, int num2){
        return Math.max(num,num2);
    }
    //Gets the total sum
    public static int getAddResult(){
        return addResult;
    }
    //Gets the total product
    public static int getProdResult(){
        return prodResult;
    }
}
