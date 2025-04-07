package March17;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumMashHap {


    static int[] mashHapMethod(int[]input, int target){
        int[] output = new int[2];
        HashMap<Integer,Integer> process = new HashMap<>();
        for(int i=0;i<input.length;i++){
            process.put(input[i],i);
            if(process.containsKey(target-input[i])){
                output[0]=process.get(input[i]);
                output[1]=process.get(target-input[i]);
            }
        }

        return output;
    }



    public static void main(String[] args) {

            int [] nums1 = {2,7,11,15}; int target1 = 9; // [0,1]
            int [] nums2 = {3,2,4};     int target2 = 6; // [1,2]
            int [] nums3= {3,3};        int target3 = 6; // [0,1]

        System.out.println(Arrays.toString(mashHapMethod(nums1,target1)));
        System.out.println(Arrays.toString(mashHapMethod(nums2,target2)));
        System.out.println(Arrays.toString(mashHapMethod(nums3,target3)));


    }
}
