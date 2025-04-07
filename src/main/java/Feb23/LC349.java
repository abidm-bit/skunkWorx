package Feb23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Stream;

public class LC349 {

/*
Given two integer arrays nums1 and nums2,
return an array of their intersection
Each element in the result must be unique and
you may return the result in any order.
*/

    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> o1 = new HashSet<>(); for(int n:nums1){o1.add(n);}
        HashSet<Integer> o2 = new HashSet<>(); for(int n:nums2){o2.add(n);}
        o1.retainAll(o2);
       return o1.stream().mapToInt(Integer::intValue).toArray();
    }

        public static void main(String[] args) {

        int [] nums1 =  {1,2,2,1}; int [] nums2 = {2,2};
            System.out.println(Arrays.toString(intersection(nums1,nums2)));

            int []nums3 = {4,9,5}; int [] nums4 = {9,4,9,8,4};
            System.out.println(Arrays.toString(intersection(nums3,nums4)));


    }
}

