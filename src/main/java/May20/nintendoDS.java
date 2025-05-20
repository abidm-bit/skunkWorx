package May20;

import java.util.*;

import static java.io.IO.println;

public class nintendoDS {
    void main(){

        String[] r1 = {"mario party","lego star wars","mario kart"};
        // Access = O(1) by index
        System.out.println(r1[2]); // prints the 3rd element : expect, mario kart
        // replacing an element = O(1) by index
        r1[1]="tony hawk"; // replaces lego star wars : expect tony hawk
        System.out.println(r1[1]);
        String[] r2 = new String[r1.length+1];
        // I want to create a new array, with an extra element
        // O(n) because the new array will have the original arrays size, and then what I add
        for(int i=0;i<r1.length;i++){
            r2[i]=r1[i];
        }
        r2[r2.length-1]="metroid prime";
        System.out.println(Arrays.toString(r2));
        System.out.println();

        LinkedList<String> name = new LinkedList<>(
        List.of("sour power straws","m&m peanuts","sour patch kids","hersheys oreos","crunch"));
        // O(1) access for the first & last elements using .getFirst() , .getLast()
        println(name.getFirst()); // expect sour power straws
        println(name.getLast());  // expect crunch
        // O(n) access a specific element, requires going thru pointers
        println(name.get(3)); // expect hersheys oreos
        System.out.println();

        Stack<String> boox = new Stack<>();
        // O(1) for .add / .push because elements are added to the top
        boox.add("Animal Farm"); boox.add("1984"); boox.add("Catcher in the Rye");
        boox.add("The Great Gatsby"); boox.push("The Pearl");
        // Stacks keep a LIFO order, the latest element will be accessed first
        // good for depth first search
        // O(1) for the top element
        println(boox.peek()); // expect "The Pearl"
        System.out.println();
        // O(n) for all elements, u have to traverse thru all elements, no random access
        for(String b:boox){println(b);}
        // which is why Queues (ArrayQueue, Dequeue) are preferred over Stacks

        System.out.println();

        Queue<Double> seal = new ArrayDeque<>();
        // Queues are lines, they keep FIFO order, whatever is added first, goes out first
        seal.offer(51.27); seal.add(64.59); seal.add(17.38);
        // O(n) to go thru all elements
        // O(1) to add an element or remove the first
        seal.add(25.99);
        seal.remove(); // removes 51.27
        System.out.println(seal); // expect [64.59, 17.38,25.99]

        System.out.println();

        HashMap<Integer,String> studentId = new HashMap<>();
        // Store data in key value pairs , 2 data types
        // LIFO order, whatever is stored last, is processed last
        // doesn't store duplicate values for a key
      studentId.put(6,"Derrick");
      studentId.put(35,"Kevin");
      studentId.put(1,"Bosh");
      // O(1) to add k,v pairs
        System.out.println(studentId.keySet()); // prints the keys only, so jersey numbers
        System.out.println();
        System.out.println(studentId.values()); // prints the values only, so player names
        System.out.println();

        // 3 ways to print the hashmap
        System.out.println(studentId.entrySet());
        System.out.println();
        for(Integer i: studentId.keySet()){
            System.out.println(i + " " + studentId.get(i));
        }
        System.out.println();
        System.out.println(studentId);

        System.out.println();

        int[] heavyfoot = {87,75,66,75,63,60,82,94,105,93,96,73,72};
        HashSet<Integer> radar = new HashSet<>();
        // Sets store unique elements only
        for(int speed:heavyfoot){radar.add(speed);}
        System.out.println(radar);

    }


}
