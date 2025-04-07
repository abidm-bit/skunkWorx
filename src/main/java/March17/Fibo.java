package March17;

import java.util.Arrays;

public class Fibo {


    // The fibonacci sequence: 0,1,1,2,3,5,8,13
    // the succeeding number is the sum of the two previous numbers
    // the first two numbers (base cases are always 0,1)


    // a static array
    // Big O: time + space = O(n)
    static void fibonacci(int request){
        int[] output = new int[request];
        output[0]=0;
        output[1]=1;

        for(int i=2;i<request;i++){
            output[i] = (output[i-2]+output[i-1]);
        }
        System.out.println(Arrays.toString(output));
    }



    public static void main(String[] args) {
        fibonacci(5); // 0,1,1,2,3
        fibonacci(7); // 0,1,1,2,3,5,8
    }

}
