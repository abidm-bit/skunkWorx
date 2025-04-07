package Feb27;

import java.util.ArrayList;
import java.util.HashMap;

class TwoSum {


    static ArrayList<Integer> twoSumM1(int[] array, int target) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Integer> process = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int difference = target - array[i];

            // Check if the complement exists in the HashMap
            if (process.containsKey(difference)) {
                output.add(process.get(difference)); // Add the index of the complement
                output.add(i); // Add the current index
                return output; // Return immediately as only one pair is needed
            }

            // Store the current value and its index in the HashMap
            process.put(array[i], i);
        }

        return output; // Return empty list if no pair is found
    }



    public static void main(String[] args) {

        int [] s1 = {2,7,11,15}; int target1 = 9;   // Output: [0,1]

        int [] s2 = {3,2,4}; int target2 = 6;       // Output: [1,2]

        int [] s3 = {3,3}; int target3 = 6;         // Output: [0,1]

        System.out.println(twoSumM1(s1,target1));
        System.out.println(twoSumM1(s2,target2));
        System.out.println(twoSumM1(s3,target3));



    }
}


