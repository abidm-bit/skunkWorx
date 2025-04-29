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
            collections.disjoint() to check if two collections don't share elements
            collections.binarySearch() to return the index of an element in a collection :: Arrays.binarySearch()
            collections.swap() to swap the position of two elements in a collection,
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

    ArrayList<Integer> num5 = new ArrayList<>(List.of(4,5,6,8,12));
    ArrayList<Integer> num6 = new ArrayList<>();num6.add(7); num6.add(8);
    System.out.println(Collections.disjoint(num5,num6)); // false bc the two collections share elements

    println("");
    println(num6);
    Collections.swap(num6,1,0);
    println("post swap");
    println(num6);

    println("");


    List<Character> harbor = new ArrayList<>(List.of('D','R','A','M','J'));
    println("harbor : " + harbor);
    List<Character> dexter = new ArrayList<>(harbor);
    println("dexter : " +dexter);

//    println(Collections.binarySearch(num5,8));

    println("");
    println("original"+num5);
    Collections.rotate(num5,2);
    println("+2 rotate "+num5);
    ArrayList<Integer> num7 = new ArrayList<>(List.of(4,5,6,8,12));
    println("original"+num7);
    Collections.rotate(num7,-2);
    println("-2 rotate "+num7);





}

}
