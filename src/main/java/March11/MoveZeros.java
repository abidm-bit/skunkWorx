package March11;

import java.util.ArrayList;
import java.util.List;

public class MoveZeros {



    public static void main(String[] args) {

        ArrayList<Integer> setOne = new ArrayList<>(List.of(0,3,5,0,1,8));
        ArrayList<Integer> setTwo = new ArrayList<>(setOne.size());
        setOne.stream().filter(e->e==0).forEach(setTwo::add);
        setOne.stream().filter(e->e!=0).forEach(setTwo::add);
    System.out.println(setTwo);
    }
}
