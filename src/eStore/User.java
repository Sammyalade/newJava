package eStore;

public class User {
    private int age;
    private String emailAddress;
    private String homeAddress;
    private String name;
    private String password;
    private String phoneNumber;
    private Customer customer;
    private Seller seller;
    private Admin admin;

    public User(int age, String emailAddress, String homeAddress, String name, String password, String phoneNumber, Customer customer, Seller seller, Admin admin) {
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.customer = customer;
        this.seller = seller;
        this.admin = admin;
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

    public String getCustomer() {
        return customer.toString();
    }

}
