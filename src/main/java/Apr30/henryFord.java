package Apr30;

import java.util.stream.IntStream;

public class henryFord {
    static int linearWF(int numb){
        return IntStream.rangeClosed(1,numb).reduce(1,(a,b)->a*b);
    }
    static String factorialStream(int numb){
        return "The factorial of " + numb + " iz " + linearWF(numb);
    }

    static int fm1(int input){
        int y =1;
        for(int i=input;i>0;i--){y*=i;}
        return y;
    }
    // same big O : time is O(n) and space is O(1)

    public static void main(String[] args) {
        System.out.println(factorialStream(5)); // 120
        System.out.println(factorialStream(6)); // 720

        System.out.println(fm1(5));

    }
}
