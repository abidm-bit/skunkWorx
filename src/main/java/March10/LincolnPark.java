package March10;

import java.util.HashMap;

public class LincolnPark {

    static void countFreq(Integer[]input){
        HashMap<Integer,Integer> answer = new HashMap<>();
        for(Integer all:input){
            answer.put(all,answer.getOrDefault(all,0)+1);
        }
        System.out.println(answer.entrySet());
    }

    static void countFreq(Character[]input){
        HashMap<Character,Integer> answer = new HashMap<>();
        for(Character all:input){
            answer.put(all,answer.getOrDefault(all,0)+1);
        }
        System.out.println(answer.entrySet());
    }

    public static void main(String[] args) {
        Integer [] set1 = {1,1,4,2,7,1,1,4,2,8,1,1,4,2,9,1,0,4,5,6};
        Character [] set2 = {'p','o','i','p','o','s','t','s','q','l'};

        countFreq(set1);
        System.out.println("\n");
        countFreq(set2);

    }
}
