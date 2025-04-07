package March20;

import java.util.LinkedList;
import java.util.Queue;

public class Lines {


    /* Queues keep a FIFO order (maintain insertion order)

    *  printer Jobs | customers in a line | orders placed

    *  store inventory: whatever is in stock is sold first
    *  as the inventory is replenished, that stock is then sold
    */

    static void HewlettPackard(){
        Queue<String> printerJobs = new LinkedList<>();
        printerJobs.offer("Cheatsheet");
        printerJobs.offer("Car insurance policy");
        printerJobs.offer("Copy of my driver's license");
        printerJobs.offer("Packing slip");
        printerJobs.offer("Shipping label");

        System.out.println("vv All of the queued printer jobs vv");

        for(String pj:printerJobs){
            System.out.println(pj);
        }

        System.out.println("\n");

        System.out.println("Access the first element in the queue using .element()");
        System.out.println("The first document to be printed is "+ printerJobs.element()); //Cheatsheet

    }


    static void ebayOrders(){
        Queue<Integer> onlineOrders = new LinkedList<>();
        onlineOrders.offer(520912);
        onlineOrders.offer(531111);
        onlineOrders.offer(532013);
        System.out.println("Access the first element in the queue using .peek()");
        System.out.println("the first order number is: "+onlineOrders.peek()); // 520912

    }


    static void groceryShopping(){
        Queue<String> aldi = new LinkedList<>();
        aldi.offer("18 items");
        aldi.offer("27 items");
        aldi.offer("3 items");

        for(String a:aldi){
            System.out.println(a);
        }

        System.out.println("The first customer left the line because an emergency came up");
        System.out.println("Remove the first element using .poll()");
        aldi.poll(); // removes "18 items"

        for(String a:aldi){
            System.out.println(a);
        }
        System.out.println("Two more customers joined the line");
        System.out.println("Add an element to the end of the queue using .add or .offer");
        aldi.add("33 items");
        aldi.offer("21 items");

        for(String a:aldi){
            System.out.println(a);
        }
    }


static void accidentalOddOrders(){
        Queue<Integer> orders = new LinkedList<>();
        orders.add(35); orders.add(36);
        orders.add(24); orders.offer(39);
        orders.add(18); orders.add(48);
        orders.add(17);
        for(Integer o:orders){
            System.out.println(o);
        }
        System.out.println("remove elements using .remove() or .removeIf(lambda condition)");
        orders.removeIf(e->e%2!=0); // remove orders with odd numbers
        System.out.println("Removed odd orders, only even orders");
    for(Integer o:orders){
        System.out.println(o);
    }

}

    public static void main(String[] args) {
        System.out.println("\n");
HewlettPackard();
        System.out.println("\n");
ebayOrders();
        System.out.println("\n");
groceryShopping();
        System.out.println("\n");
accidentalOddOrders();
    }


}
