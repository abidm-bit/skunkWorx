package Apr1;


import com.sun.jdi.Type;

import java.util.LinkedList;
import java.util.List;

public class LC83 {
   static void deleteDuplicates(LinkedList<Integer> input) {
     List<Integer> answer = input.stream().distinct().toList();
       System.out.println(answer);
   }


    public static void main(String[] args) {
        LinkedList<Integer> process = new LinkedList<>(List.of(1,1,2));
    deleteDuplicates(process);

        LinkedList<Integer> process2 = new LinkedList<>(List.of(1,1,2,3,3));
        deleteDuplicates(process2);

    }

}

/*
Input: head = [1,1,2]
Output: [1,2]

Input: head = [1,1,2,3,3]
Output: [1,2,3]

* */