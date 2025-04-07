package Feb20;

import java.util.Arrays;

class Fibo {

    /*
            0,1,1,2,3,5,8,13,21...
            baseCase: 0,1 , the next number is the sum of the two preceding numbers
    */

    static void fibonacciSequenceM1(int n) {
        int[]output = new int[n+1];
        output[0]= 0;
        output[1]= 1;
        for(int i =2;i<=n;i++){
            output[i] = output[i-1]+output[i-2];
        }
        System.out.println(Arrays.toString(output));
    }

    static int fibonacciRecursion(int n){
        if(n==0||n==1){return n;}
        else return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
    }

    static void fibonacciSequenceM2(int n){
        for(int i=0;i<=n;i++){
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }


    public static void main(String[] args) {
        System.out.println("fibonacci sequence store in an array");
        fibonacciSequenceM1(5);
        System.out.println("fibonacci sequence printed recursively:");
        fibonacciSequenceM2(5);

    }
}
