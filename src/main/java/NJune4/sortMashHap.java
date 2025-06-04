package NJune4;

/*
1) sort by key, add to a HashMap
2) stream and sort by Key
3) stream and sort by Value
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class sortMashHap {
    public static void main(String[] args) {

        HashMap<Integer,String> http = new HashMap<>();
        http.put(404,"Bad Request"); http.put(500,"Server Error");
        http.put(403,"Forbidden, no access"); http.put(401,"Not authorized");
        http.put(204,"Record deleted");


        System.out.println(http.entrySet());

        TreeMap<Integer,String> https = new TreeMap<>();
        for(Integer code:http.keySet()){https.put(code,http.get(code));}

        System.out.println();
        System.out.println("sort by adding to a treemap");
        System.out.println(https.entrySet());

        System.out.println();
        System.out.println("Stream and sort by Key");


        LinkedHashMap<Integer,String> sortedRequestCodes =http.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));

        System.out.println(sortedRequestCodes.entrySet());
        System.out.println();

        LinkedHashMap<Integer,String> sortedRequestCodes2 =http.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));

        System.out.println("Stream and sort by Value");
        System.out.println(sortedRequestCodes2.entrySet());

    }
}


//
//        System.out.println();
//        System.out.println("Stream and sort by Value");
//
//        HashMap<Double,String> sortedGummyPrices2 = gummies.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,HashMap::new));
//
//        System.out.println(sortedGummyPrices2.entrySet());
//