package May5;

public class palindrome2Pointer {

    static boolean isPalindrome(String input){
        int start =0;
        int end = input.length()-1;

        while(start<end){
            if(input.charAt(start)!=input.charAt(end)){
                return false;
            }
        start+=1;
        end -=1;
        }
        return true;
    }
    // Big O
    // time = O(n) dependent on length of string
    // space = O(1) no data structures created

    static boolean isPalindromeM2(String input){
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return input.equals(String.valueOf(sb));
    }
    // Big O
    // time = O(n) dependent on length of string, reverse method, .equals
    // space = O(n) stringbuilder datatype created


    // Leetcode 125:
    static boolean isPalindromeLC125(String s) {
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int start =0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){return false;}
            start+=1;
            end -=1;
        }
        return true;
    }


    void main(){
        System.out.println(isPalindrome("saas"));
        // expect true
        System.out.println(isPalindrome("tsa"));
        // expect false
        System.out.println(isPalindrome("civic"));
        // expect true
        System.out.println();
        System.out.println(isPalindromeM2("civic"));
        // expect true
        System.out.println();
        System.out.println(isPalindromeLC125("A man, a plan, a canal: Panama"));
        // expect true
        System.out.println(isPalindromeLC125("race a car"));
        // expect false
        System.out.println(isPalindromeLC125(" "));
        // expect true

    }

}