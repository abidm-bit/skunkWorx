package NJune3;


import java.util.*;

public class LC2085 {

    /*
    Given two string arrays words1 and words2,
    return the number of strings that appear exactly once in each of the two arrays.
     */

   static int countWords(String[] words1, String[] words2) {
       HashMap<String,Integer> wp1 = new HashMap<>();
       for(String w1:words1){wp1.put(w1,wp1.getOrDefault(w1,0)+1);}
        HashMap<String,Integer> wp2 = new HashMap<>();
       for(String w2:words2){wp2.put(w2,wp2.getOrDefault(w2,0)+1);}

       return (int) wp1.entrySet().stream()
               .filter(entry -> entry.getValue() == 1)
               .filter(entry -> wp2.getOrDefault(entry.getKey(), 0) == 1)
               .count();
   }




    public static void main(String[] args) {
        String [] w1 = {"leetcode","is","amazing","as","is"};
        String [] w2 = {"amazing","leetcode","is"};
        System.out.println(countWords(w1,w2));

    }

}
