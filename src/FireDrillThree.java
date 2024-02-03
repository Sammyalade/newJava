import java.lang.reflect.Array;
import java.util.Arrays;

public class FireDrillThree {

    public void taskOne(int[] scores){
    }

    public String taskTwo(int[] scores){
        String verticalPrint = "";
        for (int score = 0; score < scores.length; score++){
            if (scores[score] == scores[0]){
                verticalPrint += scores[score];
            } else {
                verticalPrint += "\n" + scores[score];
            }
        }
        return verticalPrint;
    }

    public String taskThree(int[] scores){
        return Arrays.toString(scores);
    }

    public int[] taskFour(int[] scores) {
        int[] elementInEvenIndex = new int[5];
        int count = 0;
        for (int index = 0; index < scores.length; index++) {
            if (index % 2 == 0) {
                elementInEvenIndex[count++] = scores[index];
                if (count == 5) {
                    break;
                }
            }
        }
        return elementInEvenIndex;
    }
    public int[] taskFive(int[] scores) {
        int[] elementInOddIndex = new int[5];
        int count = 0;
        for (int index = 0; index < scores.length; index++) {
            if (index % 2 != 0) {
                elementInOddIndex[count++] = scores[index];
                if (count == 5) {
                    break;
                }
            }
        }
        return elementInOddIndex;
    }

    public int taskSix(int[] scores){
        int sumOfElementInEvenIndex = 0;
        int count = 0;
        for (int index = 0; index < scores.length; index++) {
            if (index % 2 == 0) {
                sumOfElementInEvenIndex += scores[index];
            }
        }
        return sumOfElementInEvenIndex;
    }


    public int taskSeven(int[] scores) {
        int sumOfElementInOddIndex = 0;
        int count = 0;
        for (int index = 0; index < scores.length; index++) {
            if (index % 2 != 0) {
                sumOfElementInOddIndex += scores[index];
            }
        }
        return sumOfElementInOddIndex;
    }

    public int taskEight(int[] scores) {
        int minimumElementInEvenIndex = scores[0];
        for (int index = 0; index < scores.length; index++) {
            if (index % 2 == 0 && scores[index] < minimumElementInEvenIndex) {
                minimumElementInEvenIndex = scores[index];
            }
        }
        return minimumElementInEvenIndex;
    }

    public int taskNine(int[] scores) {
        int minimumElementInOddIndex = scores[0];
        for (int index = 0; index < scores.length; index++) {
            if (index % 2 != 0 && scores[index] < minimumElementInOddIndex) {
                minimumElementInOddIndex = scores[index];
            }
        }
        return minimumElementInOddIndex;
    }

    public int taskTen(int[] scores) {
        int maximumElementInEvenIndex = scores[0];
        for (int index = 0; index < scores.length; index++) {
            if (index % 2 == 0 && scores[index] > maximumElementInEvenIndex) {
                maximumElementInEvenIndex = scores[index];
            }
        }
        return maximumElementInEvenIndex;
    }

    public int taskEleven(int[] scores) {
        int maximumElementInOddIndex = scores[0];
        for (int index = 0; index < scores.length; index++) {
            if (index % 2 != 0 && scores[index] > maximumElementInOddIndex) {
                maximumElementInOddIndex = scores[index];
            }
        }
        return maximumElementInOddIndex;
    }

    public int[] taskTwelve(int[] scores) {
        for(int index = 0; index < scores.length; index+=2){
            int temp = scores[index];
            scores[index] = scores[index + 1];
            scores[index + 1] = temp;
        }
        return scores;
    }

    public int[] taskThirteen(int[] scores) {
        for (int index = 0; index < scores.length - 1; index += 2) {
            if (scores[index] % 2 != 0)
                if (scores[index + 1] % 2 != 0) {
                int temp = scores[index];
                scores[index] = scores[index + 1];
                scores[index + 1] = temp;
            }
        }
        return scores;
    }

    public int[] taskFourteen(int[] scores) {
        for (int index = 0; index < scores.length - 1; index += 2) {
            if (scores[index] % 2 == 0)
                if (scores[index + 1] % 2 == 0) {
                    int temp = scores[index];
                    scores[index] = scores[index + 1];
                    scores[index + 1] = temp;
                }
        }
        return scores;
    }

    public int[] taskFifteen(int[] scores) {
        for (int index = 0; index < scores.length - 1; index += 2) {
            if (scores[index] % 2 == 0 && scores[index + 1] % 2 == 0) {
                    int temp = scores[index];
                    scores[index] = scores[index + 1];
                    scores[index + 1] = temp;
            }
        }
        return scores;
    }

    public int[] taskSixteen(int[] scores) {
        for (int index = 0; index < scores.length - 1; index += 2) {
            if (scores[index] % 2 != 0 && scores[index + 1] % 2 != 0) {
                int temp = scores[index];
                scores[index] = scores[index + 1];
                scores[index + 1] = temp;
            }
        }
        return scores;
    }
}
