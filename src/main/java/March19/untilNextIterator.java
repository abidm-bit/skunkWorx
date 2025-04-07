package March19;

import java.util.*;

public class untilNextIterator {


// LinkedList and ArrayDeque

    public static void main(String[] args) {

        ArrayDeque<String> analogies = new ArrayDeque<>();
        analogies.add("apple:ios :: google:android");
        analogies.add("amazon:kindle :: apple:ipad");
        analogies.add("sony:walkman :: microsoft:zune");
        analogies.add("sony:playstation :: microsoft:xbox");
        analogies.add("bmw:rolls royce :: audi:lamborghini");


        // FIFO
        Iterator<String> iterator = analogies.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("\n");

        // using descendingIterator()
        Iterator<String> rev = analogies.descendingIterator();
        while(rev.hasNext()){
            System.out.println(rev.next());
        }

        System.out.println("\n");

        LinkedList<String> boox = new LinkedList<>();
        boox.add("Dragon Slayer");
        boox.add("Boxcar Kids");
        boox.add("Half Blood Prince");
        boox.addFirst("Science textbook");
        boox.addLast("The Catcher in the Rye");

        Iterator<String> printBooks = boox.iterator();
        while(printBooks.hasNext()){
            System.out.println(printBooks.next());
        }

        System.out.println("\n");

        Iterator<String> revBooks = boox.descendingIterator();
        while(revBooks.hasNext()){
            System.out.println(revBooks.next());
        }


    }



}
