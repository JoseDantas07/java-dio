package Set.pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContacts {

    Set<Contact> contactSet;

    public AgendaContacts() {
        this.contactSet = new HashSet<>();
    }

    public void addContacts(String name, int number) {
        contactSet.add(new Contact(name,number));
    }

    public void displayContacts(){
        System.out.println(contactSet);
    }

    public Contact searchByName(String name){
        Contact nameFound = null;
        for (Contact c : contactSet){
            if  (c.getName().equalsIgnoreCase(name)){
                nameFound = c;
                break;
            }
        }
        return nameFound;
    }

    public void updateContactNumber(String name, int newNumber){
        for (Contact c : contactSet){
            if (c.getName().equalsIgnoreCase(name)){
                c.setNumber(newNumber);
                break;
            }
        }
    }
}
