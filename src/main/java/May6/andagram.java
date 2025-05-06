package May6;

import java.util.Arrays;

public class andagram {

    static boolean anagramCheck(String inp1,String inp2){
        inp1=inp1.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        inp2=inp2.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        if(inp1.length()!=inp2.length()){return false;}
        else{
            String[] s1 = inp1.split("");
            String[] s2 = inp2.split("");
            Arrays.sort(s1); Arrays.sort(s2);
            return Arrays.equals(s1,s2);
        }

    }

    void main(){

        String td1 = " Sas"; String td2 = "SSA ";
        String td3 = "SAT."; String td4 = "TSA";
        String td5 = "fit"; String td6 = "BIT";
        System.out.println(anagramCheck(td1,td2));
        System.out.println(anagramCheck(td3,td4));
        System.out.println(anagramCheck(td5,td6));

    }

}
