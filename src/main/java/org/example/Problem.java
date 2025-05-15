package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problem {
    private int quantity;
    private List<Przedmiot> items = new ArrayList<>();

    public Problem(int quantity,int seed) {
        this.quantity = quantity;
        Random rand = new Random(seed);
        for (int i = 0; i < quantity; i++) {
            int weight = rand.nextInt(10) + 1;
            int value = rand.nextInt(10) + 1;
            Przedmiot item = new Przedmiot(i,weight, value);
            items.add(item);
        }
    }

    public Result solve(int Capacity) {
        items.sort((x, y) -> Float.compare(y.getAfordability(), x.getAfordability()));
        Result result = new Result();
        for (Przedmiot item : items) {
            while (item.getWeight() + result.getTotalWeight() <= Capacity) {
                result.getNumbers().add(item.getId());
                result.setTotalWeight(result.getTotalWeight() + item.getWeight());
                result.setTotalValue(result.getTotalValue() + item.getValue());
            }
        }

        return result;
    }

    public List<Przedmiot> getItems() {
        return items;
    }


}
