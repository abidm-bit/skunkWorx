package Apr28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.io.IO.println;

public class builtInAlgo {

    /*
            Collections - store & organize data structures
            Collections has inbuilt methods, these are generic algorithms (steps to solve problems)

            collections.min() | collections.max() to return the min & max values
            collections.sort() to sort a collection, this has a Big O of O(n log n)
            collections.shuffle() to move elements around in a collection
            collections.reverse() to reverse the order of elements in a collection
            collections.fill() to replace every element in a collection with a single value
            collections.addAll() to add all elements from an input source
            collections.frequency() to return the frequency of an element
             // collections.disjoint() to check if two collections share elements
             // collections.binarySearch() to return the index of an element in a collection :: Arrays.binarySearch()
             // collections.copy()
            // collections.swap() to swap the position of two elements in a collection,
    */

public static void main(String[]args){

    ArrayList<Integer> numb1 = new ArrayList<>(List.of(123,456,103,444,493));

    println("");
    println("the minimum element in this collection is: "+Collections.min(numb1)); // expect 103
    println("the maximum element in this collection is: "+Collections.max(numb1)); // expect 493
    println("");
    println(numb1);                  // expect: 123,456,103,444,493
    println("");
    Collections.reverse(numb1);      // reverse method
    println("post reverse()");
    println(numb1);                  // expect: 493,444,103,456,123
    println("");
    Collections.fill(numb1,9);  // fill method, replace every number with 9
    println("post fill()");
    println(numb1);                 // expect: 9,9,9,9,9
    println("");
    // I want to return the frequency of the number 9 in this collection
    println(Collections.frequency(numb1,9)); // expect 5
    println("");

    ArrayList<Integer>numb3 = new ArrayList<>(List.of(456,8,12));
    println(numb3);
    Collections.shuffle(numb3);
    println("post shuffle()");
    println(numb3);

    // spin back & add disjoint, binarysearch, copy, swap




}

}
