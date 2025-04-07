package Feb20;

import java.util.stream.IntStream;

class EvenOrOdd {

    static String m1(int x){
      return  (x%2==0) ? x+ " is even": x + " is odd";
    }

    public static void main(String[] args) {
        System.out.println(m1(-20));
        System.out.println(m1(-11));
        System.out.println(m1(24));

        // mapToObj
        // using the function static String m1
        // using IntStream.rangeClosed(1,100)

        IntStream.rangeClosed(1,100).mapToObj(EvenOrOdd::m1).forEach(System.out::println);

//        IntStream.rangeClosed(1,100).filter(e->e%2==0).forEach(e->System.out.println(e+" iz even"));
//        IntStream.rangeClosed(1,100).filter(o->o%2!=0).forEach(o->System.out.println(o+" iz odd"));




    }
}
