public class Isogram {

    public static boolean checkIsogram(String word) {
        System.out.println(word.strip().toLowerCase());
        String string = checkForDuplicate(word.strip().toLowerCase()).strip();
        System.out.println(string);
        return checkForDuplicate(word.strip().toLowerCase()).strip().length() == 26;
    }

    private static String checkForDuplicate(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]){

                }
            }
        }
        return new String(chars);
    }
}
