package org.example;
public class Main {
    public static void main(String[] args) {
        Problem problem=new Problem(11,47584636);
        System.out.println("Items: \n");
        for (Przedmiot item : problem.getItems()) {
            System.out.println(item);
        }
        Result result = problem.solve(13);
        System.out.println("Knapsack: ");
        System.out.println(result);
    }


}