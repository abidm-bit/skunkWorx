package May1;

import java.util.*;
import java.util.stream.Collectors;

import static java.io.IO.println;

public class untilNextTime {



    void main(){
        LinkedList<String> sb = new LinkedList<>();
        sb.add("Sponge Bob");
        sb.add("Spring Boot");
        sb.add("Small Batch");

        println("fifo");
        println("");
        Iterator<String> fifoPrint = sb.iterator();
        while(fifoPrint.hasNext()){
            println(fifoPrint.next());
        }
        println("");
        println("lifo");

        Iterator<String> lifoPrint = sb.descendingIterator();
        while(lifoPrint.hasNext()){
            println(lifoPrint.next());
        }
        println("");

        Stack<String> lyrix = new Stack<>();
        lyrix.push("momma couldn't save me, daddy dead so he couldn't raise me");
        lyrix.push("pleasure took my drive & caused me to crash");
        lyrix.push("feeling like im 7 5 i ain't even seen 30");

        Iterator<String> igCap = lyrix.iterator();
            while (igCap.hasNext()){
                System.out.println(lyrix.pop());
            }

        println("");

        Queue<String> hp = new ArrayDeque<>();
        hp.offer("Loan options");   // first job
        hp.offer("RESTApi guide");  // second job
        hp.offer("Museum tickets"); // third job
            println(hp);


        // I don't want to print my loan options anymore
        hp.poll(); // dequeues or removes an element
        println(hp);

        println("");

        LinkedList<String> emergencyRoom = new LinkedList<>();
        emergencyRoom.offer("wheezing");
        emergencyRoom.offer("heart attack");
        emergencyRoom.offer("fractured hand");
        println("Doctors prioritize patients in the ER");
        emergencyRoom.removeFirst();
        emergencyRoom.removeLast();
        println("after prioritizing, they tend to the patient whose had a "+ emergencyRoom.peek());

        println("");

        Integer [] gcp = {75,86,75,64,69,64,75,86,65};
        ArrayList<Integer> evenSpeed= Arrays.stream(gcp).filter(e->e%2==0).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> oddSpeed = Arrays.stream(gcp).filter(o->o%2!=0).collect(Collectors.toCollection(ArrayList::new));
        println("the even speeds include " + evenSpeed);
        println("the odd speeds include " + oddSpeed);

        println("");

        HashMap<Integer,Integer> gcpCount = new HashMap<>();
        for(Integer s:gcp){
            gcpCount.put(s,gcpCount.getOrDefault(s,0)+1);
        }
        println(gcpCount.entrySet());



        }




    }

