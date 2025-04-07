package March17;

public class CountNumb {
    //Count number of digits in an integer

    static int cyberchasem2(int x){
        String y = String.valueOf(x);
        return y.length();
    }

    static int cyberchasem1(int x){
        int counter =0;
        while(x>0){
            x=x/10; counter++;
        }
        return counter;
    }


    public static void main(String[] args) {

        System.out.println(cyberchasem2(123));
        System.out.println(cyberchasem2(31415));
        System.out.println("\n");
        System.out.println(cyberchasem1(123));

     }
}
