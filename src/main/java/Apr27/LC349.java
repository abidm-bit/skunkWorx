package Apr27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LC349 {
/*
     Intersection of Two Arrays
     Given two integer arrays nums1 and nums2
     return an array of their intersection (common)
     Each element in the result must be unique
*/

static int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> proc1 = new HashSet<>();
    for(int n1:nums1){proc1.add(n1);}
    HashSet<Integer> proc2 = new HashSet<>();
    for(int n2:nums2){proc2.add(n2);}
    proc1.retainAll(proc2);
    return proc1.stream().mapToInt(Integer::intValue).toArray();
}
// This second method: takes more memory because of the two streams and more run time
    // Theres no point in using IntStream.distinct, adding to a HashSet stores unique items only
    static int[] intersectionm2(int[] nums1, int[] nums2) {
        HashSet<Integer> pc1 = new HashSet<>();
        IntStream.of(nums1).distinct().forEach(pc1::add);
        HashSet<Integer> pc2 = new HashSet<>();
        IntStream.of(nums2).distinct().forEach(pc2::add);
        pc1.retainAll(pc2);
        return pc1.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        int [] inp1= {1,2,2,1}; int[] inp2 = {2,2};
        System.out.println(Arrays.toString(intersection(inp1,inp2))); // expected [2]
        System.out.println();
        int [] inp3= {4,9,5}; int[] inp4 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(inp3,inp4))); // expected [4,9]
    }
}
