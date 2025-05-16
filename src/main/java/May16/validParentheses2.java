package May16;

import java.util.HashMap;
import java.util.Stack;

public class validParentheses2 {

    static boolean isValid(String s) {
        Stack<Character> pringles = new Stack<>();
        HashMap<Character,Character> checkr = new HashMap();
        checkr.put(')','('); checkr.put('}','{'); checkr.put(']','[');

        for(char c: s.toCharArray()){
            if(checkr.containsKey(c)){
                if(pringles.isEmpty()|| pringles.pop()!=checkr.get(c)){return false;}
            } else pringles.add(c);
        } return pringles.isEmpty();
    }
    void main(){
        System.out.println(isValid("()"));     // expected true
        System.out.println(isValid("()[]{}")); // expected true
        System.out.println(isValid("(]"));     // expected false
        System.out.println(isValid("([])"));   // expected true
    }

}
