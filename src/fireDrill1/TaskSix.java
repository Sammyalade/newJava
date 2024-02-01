package fireDrill1;

public class TaskSix {
    public static void main(String[] args) {
        for(int count = 1; count <= 10; count++){
            int calculator = 1;
            for(int printTime = 1; printTime <= 5; printTime++){
                if (count % 4 == 0) {
                    calculator = calculator * count;
                    System.out.print(calculator + " ");
                }
            }
            System.out.print("");
            calculator = 1;
        }
    }
}
