package May6;

import java.util.Stack;

class twopointerPalindrome{

    static boolean palindromeCheck(String input){
        input=input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int i=0;
        int e=input.length()-1;
        while(i<=e){
            if(input.charAt(i)!=input.charAt(e)){return false;}
            i+=1;
            e-=1;
        }
        return true;
    }

    // LC9. Palindrome Number
    boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        int i=0;
        int e=y.length()-1;
        while(i<=e){
            if(y.charAt(i)!=y.charAt(e)){return false;}
            i+=1;
            e-=1;
        }
        return true;
    }

void main(){

    String td1 = "radar";
    String td2 = "Civic";

    System.out.println(palindromeCheck(td1)); // expected true
    System.out.println(palindromeCheck(td2)); // expected true

    int x = 757;
    int y = 456;
    int z = 2002;

    System.out.println(isPalindrome(x)); // expected true
    System.out.println(isPalindrome(y)); // expected false
    System.out.println(isPalindrome(z)); // expected true
}

}