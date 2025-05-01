package May1;


//Leetcode 20. Valid Parentheses
// https://algs4.cs.princeton.edu/13stacks/Parentheses.java.html
// --> Switch , case statements

import java.util.Stack;

public class validParentheses {


    static boolean isValid(String s){
        final char LEFT_PAREN = '(';
        final char RIGHT_PAREN = ')';
        final char LEFT_BRACE = '{';
        final char RIGHT_BRACE = '}';
        final char LEFT_BRACKET = '[';
        final char RIGHT_BRACKET = ']';
        Stack<Character> cars = new Stack<>();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case(LEFT_PAREN)-> cars.push(LEFT_PAREN);
                case(LEFT_BRACE)-> cars.push(LEFT_BRACE);
                case(LEFT_BRACKET)->cars.push(LEFT_BRACKET);
                case(RIGHT_PAREN)-> {
                    if(cars.isEmpty()){return false;}
                    if(cars.pop()!=LEFT_PAREN){return false;}
                }
                case(RIGHT_BRACE)->{
                    if(cars.isEmpty()){return false;}
                    if(cars.pop()!=LEFT_BRACE){return false;}
                }
                case(RIGHT_BRACKET)-> {
                    if (cars.isEmpty()) {
                        return false;
                    }
                    if (cars.pop() != LEFT_BRACKET) {
                        return false;
                    }
                }
            }

        }
        return cars.isEmpty();
    }



    public static void main(String[] args) {
        System.out.println(isValid("()"));     // expected true
        System.out.println(isValid("()[]{}")); // expected true
        System.out.println(isValid("(]"));     // expected false
        System.out.println(isValid("([])"));   // expected true




    }


}
