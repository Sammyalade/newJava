public class Isogram {

    public static boolean checkIsogram(String word) {
        String string = checkForDuplicate(word.toLowerCase());
        System.out.println(string);
        return checkForDuplicate(word.toLowerCase()).length() == 26;
    }

    private static String checkForDuplicate(String word) {
        StringBuilder result = new StringBuilder(word);
        for (int i = 0; i < result.length(); i++) {
            char currentChar = result.charAt(i);
            for (int j = i + 1; j < result.length(); j++) {
                if (currentChar == result.charAt(j)) {
                    result.setCharAt(j, ' ');
                }
            }
        }
        return cleanSpaces(result);
    }

    private static String cleanSpaces(StringBuilder result) {
        StringBuilder cleanedResult = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != ' ') {
                cleanedResult.append(result.charAt(i));
            }
        }
        return cleanedResult.toString();
    }
}
