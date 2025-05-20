package May20;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class hasnext{

    public static void main(String[]args){

        LinkedList<String> products = new LinkedList<>(List.of("books","electronics","swarovski","glassware","haas"));

        System.out.println("loop thru + print");
            for(String pr:products){
                System.out.println(pr);
            }
        System.out.println();

        Iterator<String> ebayListings = products.listIterator();
        System.out.println("print using an iterator");
        while(ebayListings.hasNext()){
            System.out.println(ebayListings.next());
        }

        System.out.println();

        Iterator<String> ebayListings2 = products.descendingIterator();
        System.out.println("print in reverse using an iterator");
        while(ebayListings2.hasNext()){
            System.out.println(ebayListings2.next());
        }

        System.out.println();

        System.out.println("using an iterator manually gives u more control");
        System.out.println(" in this example I'm checking if any string contains " +
                "the character o and then its removed");
        Iterator<String> sold = products.listIterator();
        while(sold.hasNext()){
            String item = sold.next();
            if(item.contains("o")){sold.remove();}
        }
        System.out.println(products); // I expect 2 items to be left

        System.out.println();

    }




}