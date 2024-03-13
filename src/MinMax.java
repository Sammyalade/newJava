import java.util.Arrays;

public class MinMax {

    private static int findMinimum(int... numbers){
        int min_value = numbers[0];
        for(int number: numbers){
            min_value = (number < min_value) ? number : min_value;
        }
        return min_value;
    }

    private static int findMaximum(int... numbers){
        int max_value = numbers[0];
        for(int number: numbers){
            max_value = (number > max_value) ? number : max_value;
        }
        return max_value;
    }

    public static String returnMinMax(int... numbers) throws Exception{
        int total = 0;
        for(int number: numbers){
            total += number;
        }
        int highest = total - findMinimum(numbers);
        int lowest = total - findMaximum(numbers);
        return Arrays.toString(new int[]{lowest, highest});
    }
}
