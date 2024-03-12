package eStore;

import java.util.ArrayList;
import java.util.List;

public class EStore {
    private List<User> users;

    public EStore(){
        users = new ArrayList<>();
    }

    public void addUser(String userType, int age, String emailAddress, String homeAddress, String name, String password, String phoneNumber){
        users.add(UserType.createUser(userType, age, emailAddress, homeAddress, name, password, phoneNumber));
    }
}
