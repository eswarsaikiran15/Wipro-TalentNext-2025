package Collection.Map;

import java.util.*;

public class ContactList {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();
        contacts.put("Alice", 987654321);
        contacts.put("Bob", 912345678);
        contacts.put("Charlie", 998877665);

        System.out.println("Is Bob in contact list? " + contacts.containsKey("Bob"));
        System.out.println("Is 912345678 in contact list? " + contacts.containsValue(912345678));

        System.out.println("Contacts:");
        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
