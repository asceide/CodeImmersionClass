public class MagicCalculator extends Calculator{
    public static double sqRt(int num){
        float x=num;
        for(int i=0; i<100; i++){ //Algorithm I remembered from my parallel processing class, sort of. it was implementing the Babylonian method of halving the result of the x(n) + (n/(x/n) as the it approaches a limit.
            x=((x+(num/x))/2);
        }
        return x;
    }
    public static double sin(int num){
        return Math.sin(num);
    }
    public static double cosine(int num){
        return Math.cos(num);
    }
    public static double tangent(int num){
        return Math.tan(num);
    }
    public static int fact(int num){
        result=num;
        for(int i=num; i>0; --i){//Factorial is multiplying all the numbers btwn the original number and 1.
            result*=i;
        }
        return (int) result;
    }
}
