package Reflection;

import java.util.List;

public class Person {
    private List<Problem> problems;


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
