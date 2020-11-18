public class ArrayMethods {
    public static int sumArray(int[] arr){
        int sum=0;
        for(int number : arr){
            sum+=number;
        }
        return sum;
    }
    public static int[] toPower(int size, int power){
        int[] results=new int[size];
        for(int i=0; i<results.length; i++){
            int product=1;
            if(i==0){
                continue;
            }
            for(int j=0; j<power; j++){
                product*=i;
            }
            results[i]=product;
        }
        return results;
    }
}
