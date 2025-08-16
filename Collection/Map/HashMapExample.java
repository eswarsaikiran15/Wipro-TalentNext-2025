package Collection.Map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Ball");
        map.put("C", "Cat");

        String keyToCheck = "B";
        System.out.println("Key " + keyToCheck + " exists? " + map.containsKey(keyToCheck));

        String valueToCheck = "Dog";
        System.out.println("Value " + valueToCheck + " exists? " + map.containsValue(valueToCheck));

        System.out.println("All key-value pairs using Iterator:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
