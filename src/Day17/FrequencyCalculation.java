package Day17;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCalculation {
    public static void main(String[] args) {
        HashMap<Character, Integer> freq = new HashMap<>();
        String s1 = "abbacda";

        for(int i = 0 ;  i < s1.length() ; i++){
            char ch = s1.charAt(i);
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch) +1);
            }
            else {
                freq.put(ch, 1);
            }
        }

//        for(int i = 0 ; i < s1.length(); i++){
//            char ch = s1.charAt(i);
//            freq.put(ch, freq.getOrDefault(ch , 0) + 1);
//        }


        for(Map.Entry<Character , Integer> city :freq.entrySet()){
            System.out.println( city.getKey() + " --> " +  city.getValue());
        }
    }


}
