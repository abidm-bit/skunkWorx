package NJune3;

import java.util.HashSet;

public class LC217 {
    /*
    * LC217 Contains Duplicates
    * Given an integer array nums, return true if any value appears at least twice in the array,
    * and return false if every element is distinct.
    *
    * */

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> proc = new HashSet<>();
        for(int a:nums){
            if(proc.contains(a)){
                return true;
            }
            proc.add(a);
        }
        return false;
    }

    static boolean containsDuplicate2(int[]nums){
        HashSet<Integer> proc = new HashSet<>();
        for(int a:nums){
            proc.add(a);
        }
        return nums.length != proc.size();
    }


    public static void main (String[]args){

       int [] r1 = {1,2,3,1};
       int [] r2 ={1,2,3,4};
        System.out.println(containsDuplicate(r1));
        System.out.println(containsDuplicate(r2));

        System.out.println(containsDuplicate2(r1));
        System.out.println(containsDuplicate2(r2));

    }

}
