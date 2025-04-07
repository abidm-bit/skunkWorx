package March20;

import java.util.Stack;

public class Pringles {
    /* Stacks keep a LIFO order
    whatever comes in last, goes out first
    like a pringles can
    the chips on top are eaten first

    or if theres a pile of bricks
    you can't pull a brick from the middle or bottom
    u take bricks from the top

    */

    static void potatoChips(){
        Stack<Integer> pringlesCan = new Stack<>();
        pringlesCan.push(94);
        pringlesCan.push(95);
        pringlesCan.push(96);
        pringlesCan.push(97);
        pringlesCan.push(98);
        pringlesCan.push(99);
        System.out.println(pringlesCan);
    }


    public static void main(String[] args) {
potatoChips();

    }

}
