package May12;

import java.util.HashMap;
import java.util.stream.Collectors;

public class HapMash {


    // Time: O(n) , Space: O(n)
    static void hashmapcountm1(String input){
        input=input.toLowerCase().replaceAll(" ","");
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(Character c:input.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        System.out.println(charCount.entrySet());
    }

    // Time: O(n) , Space: O(n)
    static void hashmapcountm2(String input){
        input=input.toLowerCase().replaceAll(" ","");
       String answer = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting())).toString();
        System.out.println(answer);
    }

    public static void main(String[] args) {

        String td1 = "watagatapitusberry";
        String td2 = "sally sells seashells by the seashore";

        String td3 = "zoobamafu";
        String td4 = "unitedstatespostalservice";

        hashmapcountm1(td1);
        hashmapcountm1(td2);

        System.out.println();

        hashmapcountm2(td3);
        hashmapcountm2(td4);

    }

}
