package March7;

/*
1. FizzBuzz
2. Given a string (all lowercase characters), return the sum of the string's characters (vowel = 1, consonant =2)
3. Given two arrays, find the different elements btwn the two arrays
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

class tcgCodingProblems {

    // 1. FizzBuzz
    static String[] soda(int x){
        return IntStream.rangeClosed(1,x)
                .mapToObj(i->
                {
                    String result = (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : "");
                    return result.isEmpty() ? String.valueOf(i) : result;
                }).toArray(String[]::new);

    }
    static List<String> fizzBuzz(int x) {
        return IntStream.rangeClosed(1,x)
                .mapToObj(i->
                {
                    String result = (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : "");
                    return result.isEmpty() ? String.valueOf(i) : result;
                }).toList();
    }
// I solved this using streams, but the original method of using if/else statements is faster


    //  2. Given a string (all lowercase characters)
    //    return the sum of the string's characters (vowel = 1, consonant =2)
    static int countCharSum(String x){
        int sum = 0;
        String [] process = x.toLowerCase().split("");
       for(String all:process){
           if(all.equals("a")|| all.equals("e")|| all.equals("i") || all.equals("o") || all.equals("u")){sum+=1;}
           else sum+=2;
       }
        System.out.print("The sum of the chars in " + x + " is: ");
        return sum; }


    // 3. Given two arrays, find the different elements btwn the two arrays
    static HashSet<Integer> differenceBtwnArrays(int[]ar1, int[]ar2){
        HashSet<Integer> a1 = new HashSet<>(); for(int a:ar1){a1.add(a);}
        HashSet<Integer> a2 = new HashSet<>(); for(int a:ar2){a2.add(a);}
        a1.removeAll(a2);
        return a1;
    }


}

class TrackStarr{
    public static void main(String[] args) {

        System.out.println(Arrays.toString(tcgCodingProblems.soda(15)));
        System.out.println(tcgCodingProblems.countCharSum("abc"));

        int[] s1 = {1,2,3,4,4,6,7,9};
        int[] s2 = {9,4,5,6};
        System.out.println(tcgCodingProblems.differenceBtwnArrays(s1,s2));


    }
}