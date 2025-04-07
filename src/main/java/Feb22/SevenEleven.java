package Feb22;

class SevenEleven {

    /*
    Create a function (no if/else):
    input 7 and return 11
    input 11 and return 7
    */

    static int whoWoodaThot(int x){
        int sum = 18;  // 7+11
        return (sum - x);
    }

    public static void main(String[] args) {
        System.out.println(whoWoodaThot(11)); // returns 7
        System.out.println(whoWoodaThot(7));  // returns 11

    }
}
