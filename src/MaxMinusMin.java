public class MaxMinusMin {

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

    public static int[] findMedian(int... numbers){
        return new int[]{(findMaximum(numbers) - findMinimum(numbers))};
    }
}
