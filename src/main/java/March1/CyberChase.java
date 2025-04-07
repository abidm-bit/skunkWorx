package March1;

import java.util.stream.Stream;

class CyberChase {


        // time O(n) , complexity O(n)
    static long countDigitsM2(int z){
        String[] a = String.valueOf(z).split("");
        return Stream.of(a).map(Integer::valueOf).count();
    }

        // time O(n) , complexity O(n)
    static int sumDigitsM2(int z){
        String[] a = String.valueOf(z).split("");
        return Stream.of(a).mapToInt(Integer::valueOf).sum();
    }


    public static void main(String[] args) {

        System.out.println("Count digits " + countDigitsM2(123));
        System.out.println("Count digits " + countDigitsM2(1311944457));

        System.out.println("\n");
        System.out.println("Sum digits "+sumDigitsM2(456));
        System.out.println("Sum digits "+sumDigitsM2(1272982367));




    }


}
