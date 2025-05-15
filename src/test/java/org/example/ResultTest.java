package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ResultTest {
    @Test
    public void testGeneratedItemCount() {
        Problem problem = new Problem(5, 123);
        assertEquals(5, problem.getItems().size(), "Should generate 5 items");
    }

    @Test
    public void testItemAfordabilityCalculation() {
        Przedmiot item = new Przedmiot(0, 10, 2);
        assertEquals(5.0f, item.getAfordability(), 0.0001f, "Afordability should be value/weight");
    }

    @Test
    public void testKnapsackTotalWeightUnderCapacity() {
        Problem problem = new Problem(10, 123);
        Result result = problem.solve(15);
        assertTrue(result.getTotalWeight() <= 15, "Total weight should not exceed knapsack capacity");
    }

    @Test
    public void testResultHasAtLeastOneItem() {
        Problem problem = new Problem(10, 321);
        Result result = problem.solve(20);
        assertFalse(result.getNumbers().isEmpty(), "Result should contain at least one item");
    }
  
}