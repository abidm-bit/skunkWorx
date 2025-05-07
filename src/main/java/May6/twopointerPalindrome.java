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

void main(){

    String td1 = "radar";
    String td2 = "Civic";

    System.out.println(palindromeCheck(td1));
    System.out.println(palindromeCheck(td2));

}

}