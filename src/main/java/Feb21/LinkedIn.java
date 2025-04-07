package Feb21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LinkedIn {




    public static void main(String[] args) {

        // O(1) for accessing elements: .get(index)
        ArrayList<Integer> leadFoot = new ArrayList<>(List.of(35,34,34,36,55,65,71,84,85,101));
        System.out.println(leadFoot.get(0)); // access an element by the index // 35
        System.out.println(leadFoot.get(leadFoot.size()-1)); // access the last element // 101



        LinkedList<Integer> brickOnThePedal = new LinkedList<>(List.of(36,71,74,75,61,65,94,83));

        System.out.println(brickOnThePedal.getFirst()); // access the first element //36
        System.out.println(brickOnThePedal.getLast()); // access the last element //83
        brickOnThePedal.removeFirst();
        brickOnThePedal.removeLast();
        brickOnThePedal.addFirst(25);
        brickOnThePedal.addLast(101);
        System.out.println(brickOnThePedal);





    }


}
