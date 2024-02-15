package Reflection;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final List<Problem> problems = new ArrayList<>();


    public void addProblem(Problem problem){
        problems.add(problem);
    }

    public void solveProblem(Problem problem){
        problems.remove(problem);
    }

    public List<Problem> recountProblem(){
        return problems;
    }

}
