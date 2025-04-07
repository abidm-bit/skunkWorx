package March7;

import java.util.Arrays;

public class LC88 {

        static void mergeArrays(int[]nums1,int m, int[]nums2, int n){
            for(int i=0;i<n;i++){
                nums1[m+i]+=nums2[i];
            }
            System.out.println(Arrays.toString(nums1));
        }


    public static void main(String[] args) {
int[]nums1 = {1,2,3,0,0,0}; int m1=3; int[] nums2 = {2,5,6}; int n1 =3;
            mergeArrays(nums1,m1,nums2,n1);
int[]nums3 = {1}; int m2 = 1; int [] nums4 = {}; int n2 = 0;
            mergeArrays(nums3,m2,nums4,n2);
        int[]nums5 = {0}; int m3 = 0; int [] nums6 = {1}; int n3 = 1;
            mergeArrays(nums5,m3,nums6,n3);

    }

}


/*

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].


Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].


Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

 */