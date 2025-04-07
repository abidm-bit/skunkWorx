package March17;

import java.util.HashMap;
import java.util.TreeMap;

public class sortMashHapByValues {
    public static void main(String[] args) {

        System.out.println("\n");

        HashMap<String,Integer> ip = new HashMap<>();
        ip.put("Better Call Saul",2024);
        ip.put("Breaking Bad",2015);
        ip.put("Power",2020);
        System.out.println(ip.entrySet());



        HashMap<String,Integer> answer2 = new HashMap<>();

        System.out.println("\n");

        TreeMap<Integer,String> answer1 = new TreeMap<>();
       for(String shows : ip.keySet()){
           answer1.put(ip.get(shows),shows);
       }
        System.out.println(answer1.entrySet());
        // sorts by values, but swaps the keys w values lol




    }
}
