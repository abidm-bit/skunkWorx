package March7;

import java.util.HashMap;

public class WordCount {

    // assuming all letters in each word is lower case
    // I'll split the sentence into an array
    // Then count using a HashMap & print the HashMap


    static void countWord(String input){
        String[] process = input.split(" ");
        HashMap<String,Integer>answer= new HashMap<>();
        for(String w:process){
            answer.put(w,answer.getOrDefault(w,0)+1);
        }
        System.out.println(answer.entrySet());
    }


    public static void main(String[] args) {

        String one = "duck duck goose";
        countWord(one);

        String carz = "honda honda mazda honda ford nissan kia nissan";
        countWord(carz);

    }
}
