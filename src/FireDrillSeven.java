public class FireDrillSeven {

    public static boolean[] returnTrueOrFalseArray(int[] inputArrays){
        boolean[] outPutArray = new boolean[inputArrays.length];
        for(int index = 0; index < inputArrays.length; index++){
            outPutArray[index] = checkOddOrEven(inputArrays[index]);
        }
        return outPutArray;
    }

    public static boolean checkOddOrEven(int number){
        return number % 2 == 1;
    }
}
