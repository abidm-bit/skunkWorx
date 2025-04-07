package March7;

class SquareRoot {

    static String isThisAPerfectSquare(int x){
        return (Math.sqrt(x)%1==0.0) ? x + " is a perfect square": x+ " is not a perfect square";
    }

    // raising something to the half power is the same as taking its square root
    static boolean isPerfectSquare(int num) {
        System.out.print(num + " is a perfect square:");
        return ((Math.pow(num,0.5)%1==0.0));
    }

    public static void main(String[] args) {

        System.out.println(isThisAPerfectSquare(6));
        System.out.println(isThisAPerfectSquare(9));
        System.out.println(isThisAPerfectSquare(25));
        System.out.println(isThisAPerfectSquare(81));
        System.out.println(isThisAPerfectSquare(121));
        System.out.println("\n");
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(3));
        System.out.println(isPerfectSquare(81));
        System.out.println(isPerfectSquare(37));
        System.out.println(isPerfectSquare(121));

    }


}



