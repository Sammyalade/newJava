package PhoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private final HashMap<String, String> contactLists = new HashMap<>();

    public void addContact(String contactName, String phoneNumber) {
        contactLists.put(contactName, phoneNumber);
    }

    public HashMap<String, String> getContacts() {
        return contactLists;
    }

    public String searchContact(String name) {
        if(contactLists.containsKey(name)) {
            return String.format("%s : %s", name, contactLists.get(name));
        }
        return "Contact not found";
    }

    public void deleteContact(String name) {
        contactLists.remove(name);
    }

    public String searchContactWithPhoneNumber(String phoneNumber) {
        for(Map.Entry<String, String> search : contactLists.entrySet()) {
            if (search.getValue().equals(phoneNumber)) {
                return String.format("%s : %s", search.getKey(), phoneNumber);
            }
        }
        return "Contact not found";
    }

    public void editPhoneNumber(String name, String phoneNumber, String newPhoneNumber) {
        contactLists.replace(name, phoneNumber, newPhoneNumber);
    }

    public String displayContact() {
        for (Map.Entry<String, String> search : contactLists.entrySet()){
            return String.format("%s : %s", search.getKey(), search.getValue());
        }
        return "Contact list empty";
    }
}
