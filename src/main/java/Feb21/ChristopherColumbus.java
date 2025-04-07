package Feb21;

import java.util.HashMap;
import java.util.TreeMap;

class ChristopherColumbus {

/*
        Maps are used to relate data in <Key,Value> pairs
        we can store two different data types
        Maps are LIFO, in the case a Duplicate key is entered
        the latest value is stored

        HashMap<K,V> does
        LinkedHashMap<K,V> keeps insertion order
        TreeMap<K,V>

*/


    public static void main(String[] args) {

        TreeMap<String,String> software = new TreeMap<>();
        // Developer | Software
        software.put("Kapersky","Russian spyware");
        software.put("Rainberry","µTorrent");
        software.put("Adobe","Dreamweaver");
        software.put("Adobe","Photoshop CS5");         // latest entry, so this gets stored
        software.put("Microsoft","Office Suite 2003");
        software.put("Microsoft","Office Suite 2021"); // latest entry, so this gets stored
        software.put("Google","Chrome Browser");
        software.put("Apple","Final Cut Studio");

        System.out.println(software.size());
        System.out.println(software.entrySet());




    }


}
