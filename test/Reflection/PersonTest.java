package Reflection;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void addProblemToList_problemSuccessfullyAddedTest(){
        Person naomi = new Person();
        naomi.addProblem(new Problem("School Fees", Type.FINANCIAL));
        assertEquals(1, naomi.recountProblem().size());
    }

    @Test
    public void removeProblemFromTheList_problemRemoved(){
        Person naomi = new Person();
        Problem financial = new Problem("School Fees", Type.FINANCIAL);
        Problem spiritual = new Problem("Bad Dreams", Type.SPIRITUAL);
        naomi.addProblem(financial);
        naomi.addProblem(spiritual);
        naomi.solveProblem(spiritual);
        assertEquals(1, naomi.recountProblem().size());
    }

    @Test
    public void recountProblemTest(){
        Person naomi = new Person();
        Problem financial = new Problem("School Fees", Type.FINANCIAL);
        Problem spiritual = new Problem("Bad Dreams", Type.SPIRITUAL);
        naomi.addProblem(financial);
        naomi.addProblem(spiritual);
        assertEquals(2, naomi.recountProblem().size());
    }
}
