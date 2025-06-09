package Apr28;

import java.util.*;


public class thePrindle {
    public static void main(String[] args) {

        int[]arr1 = {4,5,6,8,12};

        System.out.println("print the array in order");
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

System.out.println("\n");
        System.out.println("print the array in reverse");
        for(int i=arr1.length-1;i>=0;i--){System.out.print(arr1[i] + " ");}

System.out.println("\n");
        System.out.println("print the array in order, loop thru");
        for(int a:arr1){
            System.out.print(a + " ");
        }
System.out.println("\n");
        LinkedList<Integer> r2 = new LinkedList<>(List.of(0,1,1,2,3,5,8,13,21));
        System.out.println("print the linkedlist in order m1");
        for(int i = 0;i<r2.size();i++){
            System.out.print(r2.get(i)+ " ");
        }
System.out.println("\n");
        System.out.println("print the linkedlist in order m2, loop thru");
        for(Integer d2:r2){
            System.out.print(d2 + " ");
        }
System.out.println("\n");
        System.out.println("print the linkedlist in order m3, Iterator");
        Iterator<Integer> stimulus = r2.iterator();
        while(stimulus.hasNext()){
            System.out.print(stimulus.next()+ " ");
        }

System.out.println("\n");
        System.out.println("print the linkedlist in reverse m1");
        for(int i=r2.size()-1;i>=0;i--){
            System.out.print(r2.get(i)+ " ");
        }
System.out.println("\n");
        System.out.println("print the linkedlist in reverse m2, Iterator");
        Iterator<Integer> tarriffs = r2.descendingIterator();
        while(tarriffs.hasNext()){
            System.out.print(tarriffs.next()+" ");
        }

        System.out.println("how many points will this spike take");
        System.out.println(r2.get(6)+" points");
        System.out.println("the last # b4 we break this down is "+ r2.getLast());
System.out.println("\n");        r2.add(34);
        System.out.println("post adding a number, r2 is now");
        for(Integer d2:r2){
            System.out.print(d2 + " ");
        }

System.out.println("\n");
        Stack<String>boox = new Stack<>();
        boox.push("Failing Forward");
        boox.push("Outwitting the Devil");
        boox.push("A+");
        System.out.println("I skipped " + boox.peek()+ " & N+ , can u tale");
        boox.pop();
        System.out.println("this book "+ boox.peek() + " talks about modern distractions, whats ur vice?");
        boox.pop();
        System.out.println("Not only did I read "+boox.peek() + ", I listened to the audiobook ");
        boox.push("N+");
        System.out.println("A:khyda :: "+boox.peek()+":sifara");
        boox.push("Sec+");
        System.out.println(boox.peek()+" puts a target on ur bacc");

        System.out.println("\n");
        Queue<String> games = new LinkedList<>();
        games.add("Def Jam NY"); games.add("Matrix: Path of Neo"); games.add("Spiderman");
        Iterator<String> emulator = games.iterator();
        System.out.println("I'll play :");
        while(emulator.hasNext()){
            System.out.println(emulator.next());
        }

    }


}
