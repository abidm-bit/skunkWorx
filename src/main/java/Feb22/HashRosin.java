package Feb22;

import java.util.Collections;
import java.util.HashSet;

class HashRosin {

    static void intersection (Integer[] input1,Integer[] input2){
       HashSet<Integer> process1  = new HashSet<>();
       Collections.addAll(process1, input1);
       HashSet<Integer> process2 = new HashSet<>();
       Collections.addAll(process2,input2);
       process1.retainAll(process2);
        System.out.println(process1);
    }

    static void difference (Integer[] input1,Integer[] input2){
        HashSet<Integer> process1  = new HashSet<>();
        Collections.addAll(process1, input1);
        HashSet<Integer> process2 = new HashSet<>();
        Collections.addAll(process2,input2);
        process2.removeAll(process1);
        System.out.println(process2);
    }


    public static void main(String[] args) {

        Integer [] s1 = { 2,2,5,1,5,2,8,3,6,6,8};
        Integer [] s2 = { 5,5,3,5,1,2,11,6};

        intersection(s1,s2);
        difference(s1,s2);
        difference(s2,s1);

    }
}
