package K3L3;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, HashSet<String>> hM = new HashMap<>();

    public PhoneBook() {

        this.hM = hM;
    }

    public HashSet<String> get(String name) {

        return hM.get(name);
    }

    public void add(String name, String phone) {

        if(!hM.containsKey(name)){
            hM.put(name, new HashSet<>());
        }
        hM.get(name).add(phone);
    }
}
