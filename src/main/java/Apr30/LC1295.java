package Apr30;

/* LC1295. Find Numbers with Even Number of Digits
   Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
            Input: nums = [12,345,2,6,7896]
            Output: 2
            Explanation:
            12 contains 2 digits (even number of digits).
            345 contains 3 digits (odd number of digits).
            2 contains 1 digit (odd number of digits).
            6 contains 1 digit (odd number of digits).
            7896 contains 4 digits (even number of digits).
            Therefore only 12 and 7896 contain an even number of digits.

Example 2:
            Input: nums = [555,901,482,1771]
            Output: 1
            Explanation:
            Only 1771 contains an even number of digits.
 */

import java.util.ArrayList;
import java.util.List;

public class LC1295 {
    

    // runtime 3ms
//    static int findNumbersm1(int[] nums) {
//        ArrayList<String> process = new ArrayList<>();
//        for(int i:nums){process.add(String.valueOf(i));}
//        int counter =0;
//        for(String i:process){
//            if(i.length()%2==0){counter++;}
//        }
//        return counter;
//    }

    // 2ms runtime, better Big O than the first solution because
    // I ran a for loop to convert to a String & add to a Collection
    static int findNumbersm2(int[] nums) {
        int count = 0;
        for (int i : nums) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] inp1 = {12,345,2,6,7896};
        int[] inp2 = {555,901,482,1771};

        System.out.println(findNumbersm2(inp1));
        System.out.println(findNumbersm2(inp2));

    }


}
