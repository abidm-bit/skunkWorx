package NJune3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class sortMashHap {

    /*
    * Sorting hashmaps
    *   1) TreeMap
    *   2) stream and sort by Key
    *   3) stream and sort by Value
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


//        System.out.println();
//        System.out.println("Stream and sort by Key");
//
//
//        HashMap<Double,String> sortedGummyPrices =gummies.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,HashMap::new));
//
//        System.out.println(sortedGummyPrices.entrySet());
//
//        System.out.println();
//        System.out.println("Stream and sort by Value");
//
//        HashMap<Double,String> sortedGummyPrices2 = gummies.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,HashMap::new));
//
//        System.out.println(sortedGummyPrices2.entrySet());
//    }

}