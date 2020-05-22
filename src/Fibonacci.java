import java.util.Arrays;

//сложность: O(N)
public class Fibonacci {
    public static void main(String...args){
            System.out.println(Arrays.toString(getFibonacci(20)));
    }
    public static int[] getFibonacci(int length){
        int[] fibo=new int[length];
        int incr=1;
        fibo[0]=0;
        int curr=0;
        for(int i=0;i<length;i++){
            fibo[i]=incr+curr;
            curr=incr;
            incr=fibo[i];
        }
        return fibo;
    }
}
