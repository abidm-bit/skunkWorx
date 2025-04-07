package March27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Laundromat {

    /*
    Given an integer array nums,
    rotate the array to the right by k steps,
    where k is non-negative.


    Given int[] inp = {1,2,3,4,5,6,7};
    rotate the array, shift right: k =3
    int[] out = {5,6,7,1,2,3,4};

    int[] inp2  = {-1,-100,3,99};
    rotate the array, shift right: k =2
    int[] out2 = {3,99,-1,-100};

    */

    static void rotate(int[] nums, int k) {
        ArrayList<Integer> output = new ArrayList<>(); for(int n:nums){output.add(n);}
        Collections.rotate(output,k);
        System.out.println(output);
    }



    public static void main(String[] args) {
        int[] inp1 = {1,2,3,4,5,6,7}; // k = 3
//        Integer [] inp2 = {-1,-100,3,99};  // k = 2
        int [] inp2 = {-1,-100,3,99};  // k = 2

        double startTime = System.nanoTime();
        rotate(inp1,3);
        double endTime = System.nanoTime();
        double elapsedTime = (endTime-startTime)/1e6;
        System.out.println(elapsedTime + " ms");

        double startTime2 = System.nanoTime();
        rotate(inp2,2);
        double endTime2 = System.nanoTime();
        double elapsedTime2 = (endTime2-startTime2)/1e6;
        System.out.println(elapsedTime2 + " ms");

        double startTime3 = System.currentTimeMillis();
        rotate(inp1,3);
        double endTime3 = System.currentTimeMillis();
        double elapsedTime3 = (endTime3-startTime3);
        System.out.println(elapsedTime3 + " ms");

        double startTime4 = System.currentTimeMillis();
        rotate(inp2,2);
        double endTime4 = System.currentTimeMillis();
        double elapsedTime4 = (endTime4-startTime4);
        System.out.println(elapsedTime4 + " ms");



    }

}
