package May4;

import java.util.stream.IntStream;

import static java.lang.System.out;

public class pncActuary {

    static String factorialM1(int x){
        int possibilities =1;
        for(int start = x;start>=1;start--){
            possibilities*=start;
        }
        return "the factorial of "+ x + " is " + possibilities;
    }

    static String factorialM2(int y){
        int x = IntStream.rangeClosed(1,y).reduce(1,(a,b)->a*b);
        return "The factorial of " + y + " iz " +x;
    }

    static int factorialM3(int x){
        int possibilities=1;
        for(int start = x;start>=1;start--){
            possibilities*=start;
        }
        return possibilities;
    }

    static int permutations(int objects, int choices){
        return (factorialM3(objects)/factorialM3(objects-choices));
    }

    static String printArrangements(int objects, int choices){
        return  "Given " + objects +" objects, and " +choices +" choices,there are " +
                (permutations(objects, choices)) + " permutations ";
    }

    static String combinations(int pool, int choices){
        return  "Given a pool of " + pool +" objects, and " +choices +" choices,there are " +
                (factorialM3(pool)/factorialM3(choices)) + " possible combinations ";
    }



    public static void main(String[] args) {
        out.println(factorialM2(5));    // 120
        out.println(factorialM2(6));  // 720
        out.println();
        out.println(factorialM1(10));
        // 10 objects can be arranged in 3,628,800 ways

        // given 10 objects, you want to choose 6 objects in order
        out.println(printArrangements(10,6));

        // given 10 characters, you want to choose 3 numbers for a pin
        // how many possible combinations do u have
        out.println(combinations(10,3));

    }

}
