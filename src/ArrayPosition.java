public class ArrayPosition {

    public static int[] position(int[] array){
        int[] positions = new int[array.length];
        for(int count = 0; count < array.length; count++){
            positions[count] = array.length;
            for(int count2 = 0; count2 < array.length; count2++){
                if(count != count2 && array[count] < array[count2]){
                    positions[count] --;
                }
            }
        }
        return positions;
    }
}
