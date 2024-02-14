public class EvenAndOdd {

    public static int[] returnArraysOfOneAndZerosForOddAndEvenNumber(int [] inputArrays){
        for(int index = 0; index < inputArrays.length; index++){
          inputArrays[index] = transformEvenToZeroAndOddToOne(inputArrays[index]);
        }
        return inputArrays;
    }

    public static int transformEvenToZeroAndOddToOne(int number){
        return number % 2;
    }
}
