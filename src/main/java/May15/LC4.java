package May15;

import java.util.ArrayList;
import java.util.Collections;

public class LC4 {


    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> fj = new ArrayList<>();
        for(int n1:nums1){fj.add(n1);} for(int n2:nums2){fj.add(n2);}
        Collections.sort(fj);
        int median = fj.size()/2;
        if(fj.size()%2==0){
            return (double) (fj.get(median) + fj.get(median - 1)) /2;
        }
        return (double)fj.get(median);
    }


    void main(){
        int [] tdarr1 = {1,3};
        int [] tdarr2 = {2};
        System.out.println(findMedianSortedArrays(tdarr1,tdarr2));

        System.out.println();

        int [] tdarr3 = {1,2};
        int [] tdarr4 = {3,4};
        System.out.println(findMedianSortedArrays(tdarr3,tdarr4));


    }

}
