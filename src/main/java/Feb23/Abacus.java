package Feb23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

class Abacus {
    /*  Given two arrays, return the index of the different elements
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3};
    */

    static int [] differentElements(int[]input1, int[]input2){
        HashSet<Integer> process1 = new HashSet<>(); for(int a:input1){process1.add(a);}
        HashSet<Integer> process2 = new HashSet<>(); for(int b:input2){process2.add(b);}
        process1.removeAll(process2);
        return process1.stream().mapToInt(i -> i).toArray();
    }



    public static void main(String[] args) {
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3};
        System.out.println(Arrays.toString(differentElements(s1, s2)));
    }
}
