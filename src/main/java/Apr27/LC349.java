package Apr27;

import java.util.Arrays;
import java.util.HashSet;

public class LC349 {
/*
     Intersection of Two Arrays
     Given two integer arrays nums1 and nums2
     return an array of their intersection (common)
     Each element in the result must be unique
*/

static int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> proc1 = new HashSet<>(nums1.length);
    for(int n1:nums1){proc1.add(n1);}
    HashSet<Integer> proc2 = new HashSet<>(nums2.length);
    for(int n2:nums2){proc2.add(n2);}
    proc1.retainAll(proc2);
    return proc1.stream().mapToInt(Integer::intValue).toArray();
}

    public static void main(String[] args) {
        int [] inp1= {1,2,2,1}; int[] inp2 = {2,2};
        System.out.println(Arrays.toString(intersection(inp1,inp2))); // expected [2]
        System.out.println("\n");
        int [] inp3= {4,9,5}; int[] inp4 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(inp3,inp4))); // expected [4,9]
    }
}
