package March22;

public class ArnoldPress {

    /* An armstrong number
       the sum of each digit in a number raised to the power of # of digits
       should be equal to the number
       153 = 1^3 + 5^3 + 3^3 == 153, so 153 izza armstrong number
       String --> split to an array --> Math.pow()
    */

    static boolean armstrongcheck(String input){
        String[] process = input.split("");
        double sum=0;
        for(String a:process){
            sum+= Math.pow(Double.parseDouble(a),input.length());
        }
        return sum == Double.parseDouble(input);
    }


    public static void main(String[] args) {
        String i1 = "153";
        String i2 = "370";
        String i3 = "371";
        String i4 = "407";
        String i5 = "123";
        String i6 = "1634";
        String i7 = "8208";

        System.out.println(armstrongcheck(i1));
        System.out.println(armstrongcheck(i7));

    }
}
