package eStore;

public class UserType {
    public static User createUser(String userType, int age, String emailAddress, String homeAddress, String name, String password, String phoneNumber) {
        return switch (userType.toLowerCase()) {
            case "admin" -> new Admin(age, emailAddress, homeAddress, name, password, phoneNumber);
            case "customer" -> new Customer(age, emailAddress, homeAddress, name, password, phoneNumber);
            case "seller" -> new Seller(age, emailAddress, homeAddress, name, password, phoneNumber);
            default -> throw new IllegalArgumentException("Invalid user type: " + userType);
        };
    }
}
