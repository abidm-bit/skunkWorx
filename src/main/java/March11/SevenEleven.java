package March11;

public class SevenEleven {
    //Create a function: input 7 and return 11 |input 11 and return 7 (no if/else)

    static int swbat(int y){
        int z= 7+11; //18
        return z-y;
    }

    public static void main(String[] args) {

        System.out.println("Given 7, the output is "+swbat(7));   // returns 11
        System.out.println("Given 11, the output is "+swbat(11)); // returns 7
    }
}
