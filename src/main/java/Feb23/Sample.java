package Feb23;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Sample {


    public static void main(String[] args) {

        Integer [] s1 = {1,3,5,2,2,5};
        Stream.of(s1).filter(e-> Collections.frequency(List.of(s1),e)==2).distinct().forEach(System.out::println);


    }
}
