package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        Map<String, Integer> hashMap = new HashMap<>();


        hashMap.put("тигр", 5);
        hashMap.put("жираф", 8);
        hashMap.put("лев", 12);
        hashMap.put("зебра", 5);


        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }


        int value = hashMap.get("лев");
        hashMap.put("лев", value + 3);
        System.out.println("лев" + hashMap.get("лев"));




    }
}
