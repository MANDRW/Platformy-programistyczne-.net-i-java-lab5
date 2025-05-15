package org.example;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private List<Integer> numbers;
    private int totalWeight;
    private int totalValue;

    public Result() {
        this.numbers = new ArrayList<>();
        this.totalWeight = 0;
        this.totalValue = 0;
    }
    public void addNumber(int number) {
        this.numbers.add(number);
    }
    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }
    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }
    public List<Integer> getNumbers() {
        return numbers;
    }
    public int getTotalWeight() {
        return totalWeight;
    }
    public int getTotalValue() {
        return totalValue;
    }

    @Override
    public String toString() {
        String str = "items: ";
        for (int number : this.numbers)
        {
            str += number + " ";
        }
        str += "\n";
        str += "\n" + "sumValue: " + this.totalValue + "\n";
        str += "sumWeight: " + this.totalWeight + "\n";

        return str;
    }

}
