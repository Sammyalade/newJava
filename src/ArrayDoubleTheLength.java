import java.util.Arrays;

public class ArrayDoubleTheLength {

    public static int[] doubleTheLengthOfInitialArray(int[] arrays){
        return arrays = doubleTheNumbersInTheArrayAndPlaceItInTheEmptySpaces(arrays);
    }

    public static int[] doubleArrayLength(int[] arrays){
        int[] temp = new int[arrays.length*2];
        return temp;
    }

    public static int[] doubleTheNumbersInTheArrayAndPlaceItInTheEmptySpaces(int[] originalArrays){
        int[] temp = doubleArrayLength(originalArrays);
        for(int index = 0; index < originalArrays.length; index++){
            temp[index] = originalArrays[index];
            temp[index+originalArrays.length] = multiplyTheArray(originalArrays[index]);
        }
        return temp;
    }

    public static int multiplyTheArray(int array){
        return array * 2;
    }

}
