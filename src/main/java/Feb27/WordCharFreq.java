package Feb27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class WordCharFreq {

    WordCharFreq(String x){
        wordCharM2(x);
    }

    // HashMap method
    // time: O(n) space: O(n)
    static void wordCharM2(String x){
        x=x.replaceAll(" ","");
        HashMap<Character,Integer> output = new HashMap<>();
        for(char c:x.toCharArray()){
            output.put(c,output.getOrDefault(c,0)+1);
        }
        System.out.println(output.entrySet());
    }

}

class Runner{
    public static void main(String[] args) {
        new WordCharFreq("Pakalu Papito");
        new WordCharFreq("Teeeeeessst Autoooooooomationn");
    }
}


/*
    // time: O(n^2) space: O(n)
    static void wordCharM1(String x){
        x=x.replaceAll(" ","");
        ArrayList<Character> process = new ArrayList<>();
        for(int i=0;i<x.length();i++){
            process.add(x.charAt(i));
        }
        HashMap<Character,Integer> output = new HashMap<>();
        for(Character all:process){
            output.put(all, Collections.frequency(process,all));
        }
        System.out.println(output.entrySet());
    } */