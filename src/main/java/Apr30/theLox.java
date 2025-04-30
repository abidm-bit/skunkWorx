package Apr30;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
Remove char occurrences based on the input number
String input = “frontdoor”;
int Occurrence = 3;
expected output = frntdr
*/
public class theLox {

    static void apr(String inp,int occurrence){
        String[] ip = inp.split("");
        HashMap<String,Integer> counter = new LinkedHashMap<>();
        for(String i:ip){
            counter.put(i,counter.getOrDefault(i,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(String i: counter.keySet()){
            if(!counter.get(i).equals(occurrence)){
                sb.append(i);
            }
        }
        System.out.println(sb);
    }


    public static void main(String[] args) {

        String input = "frontdoor";
        int Occurrence = 3;
        apr(input,Occurrence); // prints frntd not frntdr
    }
}
