package March2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LC88 {
   static void mergeM1(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0;i<n;i++){
           nums1[i+m]+=nums2[i];
       }
       Arrays.sort(nums1);
       System.out.println(Arrays.toString(nums1));
    }


    public static void main(String[] args) {
        int[] nums1= {1,2,3,0,0,0}; int m=3;
        int[] nums2 = {2,5,6}; int n =3;

       mergeM1(nums1,m,nums2,n);

   }
}
