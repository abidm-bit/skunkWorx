package March15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LC1213 {
   static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> process = new ArrayList<>();
        for(int a:arr1){process.add(a);}
       for(int a:arr2){process.add(a);}
       for(int a:arr3){process.add(a);}


       HashMap<Integer,Integer> ans = new HashMap<>();
       for(Integer a: process){
           ans.put(a,ans.getOrDefault(a,0)+1);
       }
       ArrayList<Integer> output = new ArrayList<>();
       for(Integer num : ans.keySet()){
           if(ans.get(num)==3){
               output.add(num);
           }
       }
       Collections.sort(output);
return output;
    }

    public static void main(String[] args) {
int[]r1 = {1,2,3,4,5};
int[]r2 = {1,2,5,7,9};
int[]r3 = {1,3,4,5,8};

        System.out.println(arraysIntersection(r1,r2,r3)); // [1,5]

int[] r4 = {197,418,523,876,1356};
int[] r5 = {501,880,1593,1710,1870};
int[] r6 = {521,682,1337,1395,1764};
        System.out.println(arraysIntersection(r4,r5,r6)); // []

    }

}
