package March7;

import java.util.ArrayList;
import java.util.List;

public class CheckIfThisListIsSorted {

    // given that ArrayLists already use Abstract DataTypes (wrappers of primitive datatypes to use as objects)
    // I'm practicing the Generics extends Comparable
    // <T extends Comparable <T>> methodReturnType methodName (DataType<T> input){}

    static <T extends Comparable <T>> boolean isThisListSorted(ArrayList<T> input){
        for(int i =1;i<input.size();i++){
            if(input.get(i-1).compareTo(input.get(i))>0){return false;}
        }
        return true;
    }


    public static void main(String[] args) {

        ArrayList<Integer> s1 = new ArrayList<>(List.of(0,3,5,8));
        ArrayList<Double> s2 = new ArrayList<>(List.of(1.50,1.25,0.75,1.00));

        System.out.println(isThisListSorted(s1));
        System.out.println(isThisListSorted(s2));



    }



}
