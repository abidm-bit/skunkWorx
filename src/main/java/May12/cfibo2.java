package May12;

import java.util.Arrays;
import java.util.stream.Stream;

public class cfibo2 {

    // Big O:
    // time complexity:  O(n)
    // space complexity: O(n)
    static void fiboSeries(int x){
        int[]arr = new int[x];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<x;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }

    // Big O:
    // time complexity:  O(log max)
    // space complexity: O(1)
    static void printFiboUpto(int max){
        int x=0, y=1, z;
        do{
            System.out.print(x + " ");
            z = x + y;
            x = y;
            y = z;
        }
        while(x<max);
    }

    void main (){
        // print the first 9 numbers in the fibonacci series
        fiboSeries(9);
        // expected: [0, 1, 1, 2, 3, 5, 8, 13, 21]
        System.out.println();
        // print the fibonacci series upto 100
        printFiboUpto(100);
        System.out.println();

    }
}
