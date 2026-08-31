package Day17;

import java.util.*;

public class SetsExamples {
    public static void main(String[] args) {
//        TreeSet<Integer> ts =  new TreeSet<>();
//        ts.add(1);
//        ts.add(12);
//        ts.add(3);
//        ts.add(4);
//        System.out.println(ts); //TreeSet keep record of the insertion order , but doesn't allow duplicates
//        and also give the result in a sorted order (ascending)

//        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
//        lhs.add(42);
//        lhs.add(13);
//        lhs.add(14);
//        lhs.add(13);
//        lhs.add(15);
//        System.out.println(lhs);//LisnkedHasSet record's the insertion order but doesn't allow duplicates

//        HashSet<Integer> set1 = new HashSet<>();
//        set1.add(11);
//        set1.add(23);
//        set1.add(31);
//        set1.add(11);
//        set1.add(78);
//        System.out.println(set1);//doesn't record insertion order as well as doesn't allow duplicates
//

        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(440023, "Nagpur");
        cities.put(440013, "Jaipur");
        cities.put(440333, "HyD");
        cities.put(440344, "Chennai");

        //Entry set to get values and keys , but can only be used in for each loop

        for(Map.Entry<Integer , String> city :cities.entrySet()){
            System.out.println("Keys: " + city.getKey() + " --> Values: " +  city.getValue());
        }

        Set<Integer> keys = cities.keySet();
        System.out.println(keys);

       Object v =  cities.values();
        System.out.println(v.toString());

        System.out.println(cities.get(440023));

    }
}
