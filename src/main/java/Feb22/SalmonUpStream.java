package Feb22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SalmonUpStream {


    public static void main(String[] args) {

        System.out.println("Array -> Stream -> Print");
        String [] names = {"Playwright","Postman","Postgres","Selenium"};
        Stream.of(names).map(String::length).forEach(e-> System.out.print(e + "  "));

        System.out.println("\n");

        System.out.println("Array -> Stream -> store in an Array");
        String [] carz = {"honda","acura","toyota","lexus","saab","nissan","infiniti","mazda"};
        Integer [] carCount = Stream.of(carz).map(String::length).toArray(Integer []::new);
        System.out.println(Arrays.toString(carCount));

        System.out.println("\n");

        System.out.println("Array -> Stream -> store in a List");
        String [] software = {"vscode","slack","chrome",};
        List<Integer> charCount = Stream.of(software).map(String::length).collect(Collectors.toList());
        System.out.println(charCount);

    }

}

