package March23;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class LC1408 {
       /*
    Given an array of string words,
    return all strings in words that are a substring of another word.
    You can return the answer in any order.

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero"
is a substring of "superhero".
["hero","as"] is also a valid answer.
    */


    static List<String> stringMatching(String[] words) {
        HashSet<String> output = new HashSet<>();
        for(String w:words){
            for(String y:words){
                if(w!=y && w.contains(y)){
                    output.add(y);}
            }
        }
        return output.stream().toList();
    }



    public static void main(String[] args) {

        String [] s1 = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(s1));

    }



}
