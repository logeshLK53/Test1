package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Question2 {
    public static void main(String[] args) {
        Map<String , Integer> myMap = new HashMap<>();
        myMap.put("LK", 53);
        myMap.put("xy", 29);
        myMap.put("ab", 85);
        myMap.put("nm", 15);
        myMap.put("op", 38);
        System.out.println("Data before Sorting : ");
        myMap.forEach((k,v)->System.out.println(k+" "+v));
        List <Entry<String,Integer>> myList = new ArrayList<>(myMap.entrySet());
        myList.sort(Entry.comparingByValue());
        System.out.println("Data After Sorting : ");
        myList.forEach(System.out::println);


    }
}
