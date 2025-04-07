package Feb20;

import java.util.stream.Stream;

class ArnoldPress {
/*
    Armstrong numbers (can be 3 digits or 4 digits)
    the sum of (each digit in the number raised to the power of total digits) == the number
        e.g.   (1^3) + (5^3) + (3^3) == 153
        e.g.   (1^4) + (6^4) + (3^4) + (4^4) == 1634
        // 153,370,371,407,123,1634,8208
*/


    static boolean armStrong(String num) {
        String[] input = num.split("");
        double sum = 0.0;
        for(String i:input) {
            sum+= Math.pow(Double.parseDouble(i),num.length());
        }
        return (sum == (Double.parseDouble(num)));
    }



    public static void main(String[] args) {

        System.out.println(armStrong("153"));
        System.out.println(armStrong("1634"));
        System.out.println(armStrong("8208"));


    }

}
