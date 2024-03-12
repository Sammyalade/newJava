package eStore;

public class User {
    private int age;
    private String emailAddress;
    private String homeAddress;
    private String name;
    private String password;
    private String phoneNumber;


    public User(int age, String emailAddress, String homeAddress, String name, String password, String phoneNumber) {
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
