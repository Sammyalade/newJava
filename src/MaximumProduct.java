import java.util.Arrays;

public class MaximumProduct {


    public static int getHighestProduct(int[] array){
        if(array.length < 2) return 0;
        if(array.length == 2) return array[0] * array[1];
        int max = Integer.MIN_VALUE;
        for(int i = array.length-1; i >= 0; i--){
            for(int j = i+1; j < array.length; j++){
                if (array[i] * array[j] > max){
                    max = array[i] * array[j];
                }
            }
        }
        return max;
    }

    public static int getHighestProduct2(int[] array){
        if (array.length < 2) return 0;
        int[] temp = new int[array.length * (array.length - 1) / 2];
        int k = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                temp[k++] = array[i] * array[j];
            }
        }
        Arrays.sort(temp);
        return temp[temp.length - 1];
    }

}

