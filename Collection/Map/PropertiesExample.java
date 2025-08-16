package Collection.Map;

import java.util.*;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties states = new Properties();
        states.setProperty("Andhra Pradesh", "Amaravati");
        states.setProperty("Maharashtra", "Mumbai");
        states.setProperty("Karnataka", "Bengaluru");

        Set<Map.Entry<Object, Object>> entrySet = states.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
