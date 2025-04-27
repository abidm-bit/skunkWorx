package Apr27;

import java.util.Arrays;

public class ArnoldPress {
    /*
    An armstrong number is a number == the sum of a number's digits raised to the number of digits
    eg. 153:  (1^3)+(5^3)+(3^3) == 153, so 153 is an armstrong number
    eg. 1634: (1^4)+(6^4)+(3^4)+(4^4) == 1634, so 1634 is an armstrong number

    test data:
     // positive: [153,371,407] [1634,8208]
     // negative: [456,718,646] [1188,8956]

    - I know that I'm working with exponents & I'll use the Math.pow function
    - The Math.pow function works with doubles
    - I'll pass the number as a String (i can skip converting an integer to a String)
    - I'll split the String into an array of Strings (this array contains each digit)
    - I'll convert each digit into a double using double.parse
    - double variable for the sum, I'll loop thru the array & add to the sum
    - boolean return type, return if the sum == input, if so it's an armstrong number
     */


    static boolean ArmstrongNumber(String numb){
        double sum= 0.0;
        String[]process = numb.split("");
        for(String digit:process){
            sum+= Math.pow(Double.parseDouble(digit),numb.length());
        }
        return sum==Double.parseDouble(numb);
    }

    static String ArmStrongCheck(String numb){
       return (ArmstrongNumber(numb))?  numb + " is an Armstrong number": numb + " is not an Armstrong number";
    }


    public static void main(String[] args) {

        System.out.println(ArmstrongNumber("153"));  // expected: true
        System.out.println(ArmstrongNumber("456"));  // expected: false
        System.out.println(ArmstrongNumber("371"));  // expected: true
        System.out.println(ArmstrongNumber("1634")); // expected: true
        System.out.println(ArmstrongNumber("1188"));  // expected: false
        System.out.println("\n");
        System.out.println(ArmStrongCheck("153"));  // expected: 153 is an Armstrong number
        System.out.println(ArmStrongCheck("456"));  // expected: 456 is not an Armstrong number
        System.out.println(ArmStrongCheck("371"));  // expected: 371 is an Armstrong number
        System.out.println(ArmStrongCheck("1634")); // expected: 1634 is not an Armstrong number
        System.out.println(ArmStrongCheck("1188")); // expected: 1188 is not an Armstrong number
    }
}
