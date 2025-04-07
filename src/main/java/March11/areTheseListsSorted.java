package March11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class areTheseListsSorted {


    static boolean method1(ArrayList<Integer>input){
        for(int i=1;i<input.size();i++){
            if(input.get(i-1)>input.get(i))
            {return false;}
        }
        return true;
    }

    static <T extends Comparable> boolean method2(ArrayList<T>input){
        for(int i =1;i<input.size();i++){
            if(input.get(i-1).compareTo(input.get(i))>0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        ArrayList<Integer> setOne = new ArrayList<>(List.of(3,1,1,9,3,6));
        ArrayList<Integer> setTwo = new ArrayList<>(List.of(4,5,6,8,9));
        System.out.println(method1(setOne));
        System.out.println(method1(setTwo));

        ArrayList<Double> w8 = new ArrayList<>(List.of(0.4,1.0,3.5,7.0,14.0,28.0,56.0,112.0,224.0,448.0));
        ArrayList<Double> setThree = new ArrayList<>(List.of(0.30,0.0878));
        System.out.println(method2(w8));
        System.out.println(method2(setThree));

    }
}
