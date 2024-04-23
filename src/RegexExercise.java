public class RegexExercise {

    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneNumberRegex = "^((234|\\+234)-?|0)?(70|[8-9][0-1])\\d{8}";
        return phoneNumber.matches(phoneNumberRegex);
    }

    public static boolean validateEmail(String email) {
        String emailRegex = "[a-zA-Z0-9._+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String emailRegex2 = "[A-z0-9._+-]+@[A-z]+\\.[A-z]{2,}";
        return email.matches(emailRegex2) || email.matches(emailRegex);
    }
}
