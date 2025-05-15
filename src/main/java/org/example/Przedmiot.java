package org.example;

public class Przedmiot {
    private int id;
    private int value;
    private int weight;
    private float afordability;


    public Przedmiot(int id, int value, int weight) {
        this.id = id;
        this.value = value;
        this.weight = weight;
        this.afordability = (float) value / weight;
    };
    public int getId() {
        return id;
    }
    public int getValue() {
        return value;
    }
    public int getWeight() {
        return weight;
    }
    public float getAfordability() {
        return afordability;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setAfordability(float afordability) {
        this.afordability = afordability;
    }
    @Override
    public String toString() {
        return "no.: " + id + " value: " + this.value + " weight: " + this.weight;
    }
}
