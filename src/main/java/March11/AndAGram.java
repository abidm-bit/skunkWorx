package March11;

import java.util.Arrays;

public class AndAGram {


    static boolean anagramCheck(String input1, String input2){
        if(input1.length()!=input2.length()){return false;}
        else{
            input1=input1.toLowerCase();
            input2=input2.toLowerCase();
            char[] process1 = input1.toCharArray();
            char[] process2 = input2.toCharArray();
            Arrays.sort(process1);
            Arrays.sort(process2);
            return Arrays.equals(process1, process2);
        }
    }


    public static void main(String[] args) {
        String one = "SSA"; String two = "SAS";
        String three = "CAT"; String four = "act";
        String five = "sas"; String six = "SAAS";

        System.out.println(anagramCheck(one,two));
        System.out.println(anagramCheck(three,four));
        System.out.println(anagramCheck(five,six));



    }
}


