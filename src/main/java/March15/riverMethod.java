package March15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class riverMethod {


    public static void main(String[] args) {

        ArrayList<Integer> setOne = new ArrayList<>(List.of(1,3,5));
        int sum = setOne.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum); // 9

        ArrayList<Integer> setTwo = new ArrayList<>(List.of(4,5,6));
        Integer sumTwo = setTwo.stream().reduce(0,Integer::sum);
        System.out.println(sumTwo); // 15

        System.out.println("\n");

        OptionalDouble avg  = setTwo.stream().mapToInt(Integer::intValue).average();
        OptionalInt minV  = setTwo.stream().mapToInt(Integer::intValue).min();
        OptionalInt maxV  = setTwo.stream().mapToInt(Integer::intValue).max();


        Double avgVal = setTwo.stream().mapToInt(Integer::intValue).average().getAsDouble();
        Integer minVal = setTwo.stream().mapToInt(Integer::intValue).min().getAsInt();
        Integer maxVal = setTwo.stream().mapToInt(Integer::intValue).max().getAsInt();


//        System.out.println(avg);
//        System.out.println(maxV);
//        System.out.println(minV);

        System.out.println(avgVal);
        System.out.println(maxVal);
        System.out.println(minVal);


        System.out.println("\n");

        String input = "My name is Doug Dimmadome";
        ArrayList<String> processThis= new ArrayList<>(List.of(input.toLowerCase().split(" ")));
        processThis.stream().filter(e->e.contains("d")).mapToInt(e-> processThis.indexOf(e)).forEach(System.out::println);


        System.out.println("\n");


        String ip = "fffrronntttdoor";
        // min: output: d-1

        HashMap<String,Integer> answer = new HashMap<>();
        String[] process = ip.split("");
        for(String a:process){answer.put(a,answer.getOrDefault(a,0)+1);}

        System.out.println(Collections.min(answer.keySet())+"-"+Collections.min(answer.values()));
        System.out.println(Collections.max(answer.keySet())+"-"+Collections.max(answer.values()));


    }




}
