import java.util.HashMap;

public class ArrayNumberOfOccurrence {

    public static HashMap<String, Integer> returnNumberOfOccurrences(int[] arr) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int k : arr) {
            int counter = 0;
            for (int i : arr) {
                if (k == i) {
                    counter++;
                }
            }
            hashMap.put(String.valueOf(k), counter);
        }
        return hashMap;
    }


    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = returnNumberOfOccurrences(new int[]{1, 2, 2, 1, 3});
        System.out.println(hashMap);
    }
}
