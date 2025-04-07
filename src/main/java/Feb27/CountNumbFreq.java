package Feb27;

import java.util.*;
import java.util.stream.Collectors;

public class CountNumbFreq {

    // the time complexity of the method is O(n), and the space complexity is O(n).
    static void countM2 (Integer[]input){
        ArrayList<Integer> process = new ArrayList<>(Arrays.asList(input));
        Map<Integer,Long> answer = process.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(answer);
    }

    // the time complexity of the method is O(n), and the space complexity is O(n).
    static void countM3(Integer[]input){
        HashMap<Integer,Integer> output = new HashMap<>();
        for(Integer i:input){output.put(i,output.getOrDefault(i,0)+1);}
        System.out.println(output.entrySet());
    }

    public static void main(String[]args){
        Integer[] s1 = {1,9,1,7,9,2,6,2,2,0};

        System.out.println("Using streams:");
        countM2(s1);

        System.out.println("HashMap getOrDefault");
        countM3(s1);

    }
}



    /*
    // time complexity is O(n^2) and the space complexity is O(n).
    static Map<Integer,Integer> countM1 (Integer[]input){
        ArrayList<Integer> process = new ArrayList<>(Arrays.asList(input));
        Map<Integer,Integer> answer = new HashMap<>();
        for(Integer a: process){
            answer.put(a, Collections.frequency(process,a));
        }
        return answer;
    }
    */
