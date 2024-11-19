import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {
    HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    public void add(String name, String phoneNumber) {
        if (hashMap.containsKey(name))
            hashMap.get(name).add(phoneNumber);
        else {
            ArrayList<String> number = new ArrayList<>();
            number.add(phoneNumber);
            hashMap.put(name, number);
        }
    }

    public void get(String name) {
        System.out.println(name + ": " + hashMap.get(name));
    }
}