package March17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSumOfNumb {


    static int sumNumbM1(int x){
        int sum = 0;
        while(x>0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }



    public static void main(String[] args) {

        System.out.println(sumNumbM1(456)); //15

    }

}
