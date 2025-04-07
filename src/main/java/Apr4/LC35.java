package Apr4;

import java.util.ArrayList;
import java.util.Collections;

public class LC35 {
/*
Given a sorted array of integers & a targeted value
return the index if the target is found
if not, return the index where
it would be if it were inserted in order
*/
    static int searchInsert(int[] nums, int target) {
        ArrayList<Integer> process = new ArrayList<>();
        for(int n:nums){process.add(n);}
        if(process.contains(target)){
            return process.indexOf(target);
        }
        else{
            process.add(target);
            Collections.sort(process);
            return process.indexOf(target);
        }

    }



   void main(){
       int[] nums = {1,3,5,6};
       int target1 =5;
       int target2 =2;
       int target3 =7;
       System.out.println(searchInsert(nums,target1));
       System.out.println(searchInsert(nums,target2));
       System.out.println(searchInsert(nums,target3));
   }
}
