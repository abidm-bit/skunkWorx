package March22;

import java.util.HashSet;

public class LC217 {

    /*
     Given an integer array nums,
     return true if any value appears at least twice in the array,
     and return false if every element is distinct.
     */

    static boolean areThereDuplicates(int[]ayyar){
        HashSet<Integer> process = new HashSet<>();
        for(int a:ayyar){
            if(process.contains(a)){
                return true;}
            process.add(a);
        }
        return false;
    }


    public static void main(String[] args) {
        int td1[] = {1,2,3,1};
        int td2[] = {1,2,3,4};
        int td3[] = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(areThereDuplicates(td1));
        System.out.println(areThereDuplicates(td2));
        System.out.println(areThereDuplicates(td3));


    }

}
