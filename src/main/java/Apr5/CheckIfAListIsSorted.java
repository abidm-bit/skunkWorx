package Apr5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CheckIfAListIsSorted {

    static  <E extends Comparable> boolean isListSorted(List<E> input){
        for(int i=1;i<input.size();i++){
            if((input.get(i-1).compareTo(input.get(i))>0)){return false;}
        }
        return true;
    }

    static  <T extends Comparable> boolean isListSorted2(List<T>input){
        for(int i=1;i<input.size();i++){
            if((input.get(i-1).compareTo(input.get(i))>0)){return false;}
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> s1 = new ArrayList<>(List.of(94,95,89,98,02,22,99));
        ArrayList<Double> s2 = new ArrayList<>(List.of(0.24,.878,0.30));

        System.out.println(isListSorted(s1));
        System.out.println(isListSorted2(s2));

        Collections.sort(s1);
        Collections.sort(s2);

        System.out.println(isListSorted(s1));
        System.out.println(isListSorted2(s2));


    }



}
