package Apr28;

import java.util.HashMap;
import java.util.Locale;

import static java.io.IO.println;

public class mashHapCount {

   static String benny1 = "I was young, the plug told me, Just be patient, I'ma hit you Shit slow, work with me, just take what I can give you I took that, doubled back, and got greater, I continued";
   static String benny2 = "Cause my loyalty as good as any favor I could lend you";

   // the time and space complexity is O(n)

   static void charCount(String input){
       input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
       String[]process = input.split("");
       HashMap<String,Integer> answer = new HashMap<>();
       for(String c:process){
           answer.put(c,answer.getOrDefault(c,0)+1);
       }
       println(answer.entrySet());
   }

   void main(){
       println(benny1);
       charCount(benny1);
       println("");
       println(benny2);
       charCount(benny2);
   }


}
