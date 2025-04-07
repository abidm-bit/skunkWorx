package March8;

import java.util.Arrays;

public class Elsee88 {

static int[] combineArrays(int[]s1,int m, int[]s2 ,int n){
    for(int i=0;i<n;i++){
        s1[m+i]+=s2[i];
    }
    return s1;
}


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; int m1 = 3;
        int[] nums2 = {2,5,6}; int n1 = 3;
        // should output: [1,2,2,3,5,6]

        int[] nums3 = {1}; int m2 =1;
        int[] nums4 = {}; int n2=0;
        // should output: [1]

        int[] nums5 = {1}; int m3 =1;
        int[] nums6 = {}; int n3=0;
        // should output: [1]

        System.out.println(Arrays.toString(combineArrays(nums1,m1,nums2,n1)));

        System.out.println(Arrays.toString(combineArrays(nums3,m2,nums4,n2)));

        System.out.println(Arrays.toString(combineArrays(nums5,m3,nums6,n3)));
    }

}

