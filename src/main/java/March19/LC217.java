package March19;

import java.util.HashMap;

public class LC217 {

     /*
     Given an integer array nums,
     return true if any value appears at least twice in the array,
     and return false if every element is distinct.
     */

    static String processM1(int[]input){
        HashMap<Integer,Integer> answer = new HashMap<>();
        for(int a:input){
            answer.put(a,answer.getOrDefault(a,0)+1);
        }
        if (answer.containsValue(2)) return "this array doesn't have duplicate elements";
    return "this array contains duplicate elements";
    }


    public static void main(String[] args) {
        int td1[] = {1,2,3,1};
        int td2[] = {1,2,3,4};
        int td3[] = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(processM1(td1));
        System.out.println(processM1(td2));
        System.out.println(processM1(td3));
    }
}
