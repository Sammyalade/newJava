package fireDrill1;

public class TaskEight {
    public static void main(String[] args) {
        int total = 0;
        for (int count = 1; count <= 10; count++) {
            int calculator = 1;
            for (int printTime = 1; printTime <= 5; printTime++) {
                if (count % 4 == 0) {
                    calculator = calculator * count;
                    total += calculator;
                }
            }
            calculator = 1;
        }
        System.out.printf("%d ", total);
    }
}
