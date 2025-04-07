package March10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class riverMethods {
    public static void main(String[] args) {


        List<Integer> set1 = new ArrayList<>(List.of(1,2,3,4,5));
        int sum = set1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("sum using reduce:");

        List<Integer> numbers = Arrays.asList(5,94,101,65);
        int sum2 = numbers.stream().reduce(0, Integer:: sum);
        System.out.println(sum2);

        System.out.println("Find the max element:");
        int sum3 = numbers.stream().reduce(0,Integer::max);
        System.out.println(sum3);

        System.out.println("Find the max element:");
        Integer [] set2 = {7,6,3,4};
        System.out.println(Arrays.stream(set2).reduce(0,Integer::max));




    }
}
