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

    public static void main(String[] args) {
        System.out.println(armStrongNumberCheck("407"));
        System.out.println(armStrongNumberCheck("1643"));
        System.out.println(armStrongNumberCheck("1634"));
    }

}
