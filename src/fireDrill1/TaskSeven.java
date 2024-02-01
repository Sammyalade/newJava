package fireDrill1;

public class TaskSeven {
    public static void main(String[] args) {
        for(int count = 1; count <= 10; count++){
            int calculator = 1;
            int total = 0;
            for(int printTime = 1; printTime <= 5; printTime++){
                if (count % 4 == 0) {
                    calculator = calculator * count;
                    total += calculator;

                }

            }
            if (total > 0) {
                System.out.printf("%d ", total);
            }
            calculator = 1;
            total = 0;
        }
    }
}
