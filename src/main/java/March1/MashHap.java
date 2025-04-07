package March1;

import java.util.HashMap;

class MashHap {

    static HashMap<Character,Integer> countChars(String input){
        input=input.replaceAll("[^a-zA-Z0-9]","");
        HashMap<Character, Integer> answer = new HashMap<>();
        for(char c:input.toCharArray()){
            answer.put(c,answer.getOrDefault(c,0)+1);
        }
       return answer;
    }


    public static void main(String[] args) {

        String td1 = "Fifth premiere immigrants originally montana duplicate hong, realize weekend ana exclusion stevens my plastics, physical roughly somehow gained alternatively boys jam, thanks fixtures added.";
        System.out.println(countChars(td1).entrySet());


        System.out.println("\n");

        HashMap<String,Integer> seasonz = new HashMap<>();
        seasonz.put("Winter",4);
        seasonz.put("Spring",2);
        seasonz.put("Fall",3);
        seasonz.put("Summer",1);
        seasonz.forEach((key,value)-> System.out.println(key + " " + value));


    }



}

/*





 */