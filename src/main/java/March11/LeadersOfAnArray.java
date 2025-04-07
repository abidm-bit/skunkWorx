package March11;

import java.util.ArrayList;

public class LeadersOfAnArray {

static void loa (int[]input){
    int fl = input[input.length-1];
    ArrayList<Integer> output = new ArrayList<>();
    output.addLast(fl);
    for(int i = input.length-1;i>0;i--){
        if(input[i-1]>input[i] && input[i-1]>fl){output.addFirst(input[i-1]);}
    }
    System.out.println(output);
}


    public static void main(String[] args) {
        int [] arr1 = {15,16,3,2,6,1,4}; // 16,6,4
        loa(arr1);

        int [] arr2 = {16,17,4,3,5,2};   // 17,4,5,2
        loa(arr2);
    }

}
/*

The most right number  (the last index) is a leader
If a number is greater than the number to its right, it's a leader
int [] arr1 = {15,16,3,2,6,1,4}; // 16,6,4
int [] arr2 = {16,17,4,3,5,2};   // 17,5,2




 */