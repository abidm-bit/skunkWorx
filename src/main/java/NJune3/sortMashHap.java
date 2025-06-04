package NJune3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class sortMashHap {

    /*
    * Sorting hashmaps
    *   1) TreeMap
    * */


    public static void main(String[] args) {

        HashMap<Double,String> gummies = new HashMap<>();
        gummies.put(1.25,"Sour burger"); gummies.put(9.75,"Drops"); gummies.put(6.99,"Whoa");

        System.out.println("b4 sorting");
        System.out.println(gummies.entrySet());
        System.out.println();
        System.out.println("Add to a TreeMap & sort by Key");

        TreeMap<Double,String> sortedGP = new TreeMap<>();
        for(Double pr:gummies.keySet()){
            sortedGP.put(pr,gummies.get(pr));
        }
        System.out.println(sortedGP.entrySet());
}
}