package Apr25;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class jergens {

    static <E extends Comparable> boolean checkifSortedm1(List<E> input){
        for(int i=1;i<input.size();i++){
           if (input.get(i-1).compareTo(input.get(i))>0){return false;}
        } return true;
    }

    static <T extends Comparable> boolean checkifSortedm2(List<T>input){
        for(int i=1;i<input.size();i++){
            if (input.get(i-1).compareTo(input.get(i))>0){return false;}
        } return true;
    }

    static <E extends Comparable>HashMap counter(List<E>input){
        HashMap<E,Integer> answer = new HashMap<>();
        for(E each:input){answer.put(each,answer.getOrDefault(each,0)+1);}
        return answer;
    }


    public static void main(String[] args) {

    List<Character> board = new ArrayList<>(List.of('U','P','T','I','P','O','D','W','B','P','D','I','D','E','L','M','R','T','F'));
    List<Integer> abacus = new ArrayList<>(List.of(34,56,1188,93));

        System.out.println(checkifSortedm1(board));
        System.out.println(checkifSortedm2(abacus));
        System.out.println(counter(board).entrySet());



    }
}
