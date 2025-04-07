package March14;

import java.util.ArrayList;
import java.util.Collections;

public class LC4 {

    /*
    Example 1:
    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.

    Example 2:
    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

    */




    double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> process = new ArrayList<>();

        // Merge both arrays
        for (int n1 : nums1) process.add(n1);
        for (int n2 : nums2) process.add(n2);

        // Sort the merged list
        Collections.sort(process);

        int n = process.size();
        int mid = n / 2;

        // If even length, take the average of two middle elements
        if (n % 2 == 0) {
            return (process.get(mid - 1) + process.get(mid)) / 2.0;
        }
        // If odd length, return the middle element
        else {
            return process.get(mid);
        }
    }


    public static void main(String[] args) {

        int[] s1 = {1,3}; int[]s2 = {2};
        int[] s3 = {1,2}; int[]s4 = {3,4};

        LC4 piday = new LC4();

        System.out.println(piday.findMedianSortedArrays(s1,s2));
        System.out.println(piday.findMedianSortedArrays(s3,s4));

    }




}
