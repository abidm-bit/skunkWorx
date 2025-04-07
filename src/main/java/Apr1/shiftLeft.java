package Apr1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shiftLeft {

    public static void main(String[] args) {

        ArrayList<Integer> dory = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        System.out.println("original "+ dory);
        Collections.rotate(dory,-4);
        System.out.println("left shift 4 "+dory);

        System.out.println("\n");

        ArrayList<Integer> dory2 = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        System.out.println("original "+dory2);
        Collections.rotate(dory2,4);
        System.out.println("right shift 4 "+dory2);

        System.out.println("\n");

        ArrayList<String> elmenteri = new ArrayList<>(List.of("duck","duck","duck","goose"));
        System.out.println("original "+elmenteri);
        Collections.rotate(elmenteri,-1);
        System.out.println("left shift 1 " +elmenteri);
    }
}
