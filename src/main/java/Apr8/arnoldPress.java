package Apr8;



public class arnoldPress {


    //1634
    //407


    static boolean armStrongNumberCheck(String number){
       double sum = 0.0;
       String [] proc = number.split("");
       for(String e:proc){
           sum+=(Math.pow(Double.parseDouble(e),number.length()));
       }

        return Double.valueOf(number).equals(sum);
    }

    // More efficient Armstrong number check with better Big O
    static boolean armStrongNumberCheckm2(String number) {
        int num = Integer.parseInt(number);
        int originalNum = num;
        int power = number.length();
        int sum = 0;
        
        // Extract each digit and raise to power
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, power);
            num /= 10;
        }
        
        return sum == originalNum;
    }

    public static void main(String[] args) {
        System.out.println(armStrongNumberCheck("407"));
        System.out.println(armStrongNumberCheck("1643"));
        System.out.println(armStrongNumberCheck("1634"));
        
        System.out.println("\n--- Testing new method ---");
        System.out.println(armStrongNumberCheckm2("407"));
        System.out.println(armStrongNumberCheckm2("1643"));
        System.out.println(armStrongNumberCheckm2("1634"));
    }

}
