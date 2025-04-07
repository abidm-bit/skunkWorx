package March16;

import java.util.HashMap;

public class MashHapCountFreq {

    static void process (String input){
        char[] spl = input.replaceAll(" ","").toCharArray();
        HashMap<Character,Integer> answer = new HashMap<>();
        for(char a:spl){
            answer.put(a,answer.getOrDefault(a,0)+1);}
        System.out.println(answer.entrySet());
    }

    public static void main(String[] args) {
        String a = "et tu brute";
        process(a);
    }
    
}
