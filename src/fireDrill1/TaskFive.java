package fireDrill1;

public class TaskFive {
    public static void main(String[] args) {
        for(int count = 1; count <= 10; count++){
            for(int printTime = 0; printTime < 5; printTime++){
                if (count % 4 == 0) {
                    System.out.print(count);
                }
            }
            if (count % 4 == 0) {
                System.out.print(" ");
            }
        }
    }
}
