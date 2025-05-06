package May6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class comparableArrayndList{

    static<E extends Comparable>  boolean checkIfSorted(E[]input){
        for(int i=1;i<input.length;i++){
            if((input[i]).compareTo(input[i-1])>0){return false;}
        }
        return true;
    }
    static <T extends Comparable> boolean checkIfSorted(ArrayList<T>input){
        for(int i=1;i<input.size();i++){
            if(input.get(i).compareTo(input.get(i-1))>0){return false;}
        }
        return true;
    }







    void main(){

        Character [] bcs = {'j','c','k','s','s','h','g'};

        ArrayList<Integer> arduino = new ArrayList<>(List.of(4,3,32));

        System.out.println(checkIfSorted(bcs));

        System.out.println(checkIfSorted(arduino));

    }

}