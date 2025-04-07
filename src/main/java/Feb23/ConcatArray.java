package Feb23;

import java.util.Arrays;
import java.util.stream.Stream;

class ConcatArray {


    public static void main(String[] args) {

Integer [] s1 = {1,2,3};
Integer [] s2 = {7,8,9};
Integer [] m1 = Stream.concat(Arrays.stream(s1),Arrays.stream(s2)).toArray(Integer[]::new);
System.out.println(Arrays.toString(m1));


    }

}
