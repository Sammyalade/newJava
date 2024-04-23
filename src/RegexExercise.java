public class RegexExercise {

    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneNumberRegex = "^((234|\\+234)-?|0)?(70|[8-9][0-1])\\d{8}";
        return phoneNumber.matches(phoneNumberRegex);
    }
}
