import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillThreeTest {

    @Test
    public void testThatTaskOneCanTakeTenArray(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        fireDrillThree.taskOne(arrays);
    }

    @Test
    public void testThatTaskTwoCanPrintArrayVertically(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String returning = fireDrillThree.taskTwo(arrays);
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10", returning);
    }

    @Test
    public void testThatTaskThreeCanPrintArrayHorizontally(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String returning = fireDrillThree.taskThree(arrays);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", returning);

    }

    @Test
    public void testThatTaskFourCanPrintArrayInEvenIndex(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] returning = fireDrillThree.taskFour(arrays);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, returning);

    }

    @Test
    public void testThatTaskFiveCanPrintArrayInEvenIndex(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] returning = fireDrillThree.taskFive(arrays);
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, returning);

    }

    @Test
    public void testThatTaskSixCanPrintArrayInEvenIndex(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int returning = fireDrillThree.taskSix(arrays);
        assertEquals(25, returning);

    }

    @Test
    public void testThatTaskSevenCanPrintArrayInEvenIndex(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int returning = fireDrillThree.taskSeven(arrays);
        assertEquals(30, returning);

    }

    @Test
    public void testThatTaskEightCanReturnMinimumValueOfEvenElements(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {3, 2, 5, 4, 1, 6, 7, 8, 9, 10};
        int returning = fireDrillThree.taskEight(arrays);
        assertEquals(1, returning);
    }

    @Test
    public void testThatTaskNineCanReturnMinimumValueOfOddElements(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {3, 2, 5, 4, 1, 6, 7, 8, 9, 10};
        int returning = fireDrillThree.taskNine(arrays);
        assertEquals(2, returning);
    }
    @Test
    public void outputMaximumValueOfTaskFour_displaysMaximumValue(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {3, 2, 5, 4, 1, 6, 7, 8, 9, 10};
        int returning = fireDrillThree.taskTen(arrays);
        assertEquals(9, returning);
    }

    @Test
    public void outputMaximumValueOfTaskFive_displaysMaximumValueTest(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {3, 2, 5, 4, 1, 6, 7, 8, 9, 10};
        int returning = fireDrillThree.taskEleven(arrays);
        assertEquals(10, returning);
    }

    @Test
    public void swapValuesInOddIndexWithEvenIndexTest(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {3, 2, 5, 4, 1, 6, 7, 8, 9, 10};
        int[] returning = fireDrillThree.taskTwelve(arrays);
        assertArrayEquals(new int[]{2, 3, 4, 5, 6, 1, 8, 7, 10, 9}, returning);
    }

    @Test
    public void swapValuesInOddIndexWithEvenIndexOnlyWhenOneScoreIsOddTest(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {3, 2, 5, 4, 1, 6, 7, 8, 7, 5};
        int[] returning = fireDrillThree.taskThirteen(arrays);
        assertArrayEquals(new int[]{3, 2, 5, 4, 1, 6, 7, 8, 5, 7}, returning);
    }

    @Test
    public void swapValuesInOddIndexWithEvenIndexOnlyWhenOneScoreIsEvenTest(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {3, 2, 5, 4, 2, 6, 7, 8, 7, 5};
        int[] returning = fireDrillThree.taskFourteen(arrays);
        assertArrayEquals(new int[]{3, 2, 5, 4, 6, 2, 7, 8, 7, 5}, returning);
    }

    @Test
    public void swapValuesInOddIndexWithEvenIndexOnlyWhenBothScoreIsOddTest(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {2, 6, 4, 10, 2, 6, 7, 8, 7, 5};
        int[] returning = fireDrillThree.taskFifteen(arrays);
        assertArrayEquals(new int[]{6, 2, 10, 4, 6, 2, 7, 8, 7, 5}, returning);
    }

    @Test
    public void swapValuesInOddIndexWithEvenIndexOnlyWhenBothScoreIsEvenTest(){
        FireDrillThree fireDrillThree = new FireDrillThree();
        int[] arrays = {2, 6, 4, 10, 2, 6, 7, 9, 5, 7};
        int[] returning = fireDrillThree.taskSixteen(arrays);
        assertArrayEquals(new int[]{2, 6, 4, 10, 2, 6, 9, 7, 7, 5}, returning);
    }
}
