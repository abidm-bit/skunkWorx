package March11;

import java.util.HashMap;

public class countCars {

    static void countChars(String input){
        input=input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        char [] process = input.toCharArray();
        HashMap<Character,Integer> answer = new HashMap<>();
        for(char all:process){
            answer.put(all,answer.getOrDefault(all,0)+1);
        }
        System.out.println(answer.entrySet());

    }


    public static void main(String[] args) {

        String process = "My name is Doug Dimmadome, owner of the Dimmsdale Dimmadome!";

        countChars(process);

    }
}
