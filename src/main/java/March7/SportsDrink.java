package March7;

import java.util.stream.IntStream;

class SportsDrink {

    // a prime number has 2 factors, 1 and itself
    // else its composite

    static String primeOrcomposite(int x){
        int count =0;
        for(int i=1;i<=x;i++){
            if(x%i==0){count++;}
        }
        if(count==2){return x+ " iz Prime";}
        return x + " iz Composite";
    }

    public static void main(String[] args) {

         double startTime = System.nanoTime();
        IntStream.rangeClosed(1,100).mapToObj(x->primeOrcomposite(x)).forEach(System.out::println);
        double endTime = System.nanoTime();
        double elapsedTime = (endTime-startTime)/1e6;
        System.out.println(elapsedTime + " milliseconds");



    }


}
