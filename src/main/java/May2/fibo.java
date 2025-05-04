package May2;

import java.util.Arrays;
import java.util.stream.Stream;

public class fibo {

    static void fibom1(int numbers) {
        Stream.iterate(new int[]{1, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(numbers) // # of numbers to print in the sequence
                .map(f -> f[0])
                .forEach(e -> System.out.print(e + " ")); // Output: 01123581321
    }
    // big O: time is O(n) and space is O(1)

    static void fibom2(int numbers){
        int[] answer = new int[numbers];
        answer[0]=1;
        answer[1]=1;
        for(int i=2;i<=numbers-1;i++){
            answer[i]= answer[i-2]+answer[i-1];
        }
        System.out.println(Arrays.toString(answer));
    }
    // big O: time and space is O(n)

    // recursive method to get the #nth number in the fibonacci sequence
    static int fibom3(int number){
        if(number<=1){return 1;}
        else return ((number-1) + fibom3(number-2));
    }

    public static void main(String[] args) {

        fibom1(9);   // prints 9 digits in the fibonacci sequence, upto 21
        System.out.println();
        fibom1(8);   // prints 8 digits in the fibonacci sequence, upto 13

        System.out.println();
        fibom2(9);  // prints 9 digits in the fibonacci sequence, upto 21
        fibom2(8);  // prints 8 digits in the fibonacci sequence, upto 13

        System.out.println();
        System.out.println(fibom3(9));
    }
}