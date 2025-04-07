package Apr5;

public class LC2529 {

    /*
    Given an array nums sorted in non-decreasing order,
    return the maximum between the number of positive integers
    and the number of negative integers.
In other words, if the number of positive integers in nums is pos
and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.
    */


    static int maximumCount(int[] nums) {
        int posC=0; int negC=0;
        for(int n:nums){
            if(n>0){posC++;}
            else if(n<0){negC++;}
            else{
                // Note that 0 is neither positive nor negative
                 }
        }
        return Math.max(posC,negC);
    }

    public static void main(String[] args) {

        int[]nums1 = {-2,-1,-1,1,2,3};
        int[]nums2 ={-3,-2,-1,0,0,1,2};
        int[]nums3={5,20,66,1314};

        System.out.println(maximumCount(nums1));
        System.out.println(maximumCount(nums2));
        System.out.println(maximumCount(nums3));

    }
}
