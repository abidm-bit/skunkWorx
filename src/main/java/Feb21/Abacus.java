package Feb21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Abacus {

    static int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }
    static int countChars(String sentence) {
        sentence = sentence.replaceAll(" ","");
        String[] words = sentence.split("");
        return words.length;
    }

    static int sumDigits(int x){
        int sum =0;
        while(x>0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }

    static int countDigits(int y){
        int digits =0;
        while(y>0){
            digits += y%10;
            y=y/10;
        }
        return digits;
    }

    static void countArrElements(int[]arr){
        ArrayList<Integer> process = new ArrayList<>(); for(int a:arr) {process.add(a);}
        HashMap<Integer, Integer> count = new HashMap<>();
        for(Integer p:process){
            count.put(p, Collections.frequency(process,p));
            }
        System.out.println(count.entrySet());
    }

    public static void main(String[] args) {
        System.out.println(countWords("bye bye")); // 2
        System.out.println(countChars("bye bye")); // 6

        System.out.println(sumDigits(456)); // 15
        System.out.println(countDigits(456)); // 3

        int[] s1 = {8,12,12,8,8,314};
        countArrElements(s1);

    }

}
