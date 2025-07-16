package map.operacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class ContactList {

    Map<String, Integer> integerMap;

    public ContactList() {
        this.integerMap = new HashMap<>();
    }

    public void addContact(String name, Integer number){
        integerMap.put(name,number);
    }

    public void removeContact(String name){
        integerMap.remove(name);
    }

    public void displayContact(){
        System.out.println(integerMap);
    }

    public Integer searchByName(String name){
        Integer contactName = null;
        if (!integerMap.isEmpty()){
            contactName = integerMap.get(name);
        }
        return contactName;
    }
}
