package May26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mundae {

    public static void main(String[]args){

        System.out.println(arnoldpress(153));
        System.out.println(arnoldpress(1634));
        System.out.println(arnoldpress(111));

    }

    /*
    *  An armstrong number is == the sum of its digits raised to the number of digits
    *  intTd1 = 153;     intTd2 = 1634;
    *  153 (3 digits) = 1^3 + 5^3 + 3^3 == 153 , so 153 iz an armstrong number xD
    *  1634(4 digits) = 1^4 + 6^4 + 3^4 + 4^4 == 1643, so 1643 iz an armstrong number xD
    */
    static boolean arnoldpress(int x){
        double sum=0.0;
        String[]pr =String.valueOf(x).split("");
        for(String i:pr){
            sum+=Math.pow(Double.parseDouble(i),pr.length);
        }
        return Double.valueOf(x).equals(sum);
    }



}