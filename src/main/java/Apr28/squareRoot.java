package Apr28;

public class squareRoot {

    // Given a number, find its square root
    // Input the number as a double
    // Use the built in math functions .sqrt or .pow
    // .sqrt is more direct
    // .pow (raising a number to 1/2 or 0.5) gives u the  square root


    static double wutSquareRootm1(double inp){
        return Math.sqrt(inp);
    }

    static double wutSquareRootm2(double inp){
        return Math.pow(inp,0.5);
    }

    public static void main(String[] args) {
        System.out.println(wutSquareRootm1(121)); // expect 11.0
        System.out.println(wutSquareRootm2(9));   // expect 3.0
        System.out.println(wutSquareRootm1(144)); // expect 12.0
        System.out.println(wutSquareRootm2(81));  // expect 9.0
        System.out.println(wutSquareRootm1(256)); // expect 16.0


    }
}
