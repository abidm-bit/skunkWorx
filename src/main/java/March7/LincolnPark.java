package March7;

import java.util.HashMap;

public class LincolnPark {
    // to count the frequency of numbers in an array
    // I'll add each number as a key to a HashMap
    // I'll add the frequency as a value
    // hm.getOrDefault(x,0)+1);

    static void numbCount(int[]input){
        HashMap<Integer,Integer> answer = new HashMap<>();
        for(int all:input){answer.put(all,answer.getOrDefault(all,0)+1);}
        System.out.println(answer.entrySet());
    }


    public static void main(String[] args) {
    int[] nums1 ={4,2,5,5,1,6,2,2,0,2,7,6};
    numbCount(nums1);
    }

}
