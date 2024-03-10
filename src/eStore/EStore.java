package eStore;

import java.util.ArrayList;
import java.util.List;

public class EStore {
    private List<User> users;

    public EStore(){
        users = new ArrayList<>();
    }

    public void addUser(int age, String emailAddress, String homeAddress, String name, String password, String phoneNumber, UserType userType){
        User newUser = new User(age, emailAddress, homeAddress, name, password, phoneNumber);

        newUser.setUserType(userType);

        users.add(newUser);
    }
}
