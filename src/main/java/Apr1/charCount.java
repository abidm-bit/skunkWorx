package Apr1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class charCount {

    static void countOccurrencesOf(String ip,char x){
        int counter=0;
        ip=ip.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        for(int i=0;i<ip.length();i++){
            if (ip.charAt(i)==x){counter++;}
        }
        System.out.println(counter);
    }

    static void countOccurrencesOfM2(String ip,char x){
        ArrayList<String>process = new ArrayList<>(List.of(ip.toLowerCase().replaceAll("[^a-zA-Z0-9]","").split("")));
        System.out.println(Collections.frequency(process,String.valueOf(x)));
    }

    public static void main(String[] args) {

        String input1 = "my name is doug dimmadome, mayor of dimsdome";

        double start = System.currentTimeMillis();
        countOccurrencesOf(input1,'d');
        double end = System.currentTimeMillis();
        double elapsed = end-start;
        System.out.println(elapsed + " ms");

        double start2 = System.currentTimeMillis();
        countOccurrencesOfM2(input1,'d');
        double end2 = System.currentTimeMillis();
        double elapsed2 = end2-start2;
        System.out.println(elapsed2 + " ms");
    }
}
