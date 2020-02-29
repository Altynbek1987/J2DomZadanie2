package com.company;

public class Excavator implements Printable {
    private int weight;
    private String model;

    public String getModel() {
        return model;
    }

    public int getWeight() {

        return weight;
    }
    public Excavator(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }
    public void print(){
        System.out.println("Вес: "+ getWeight() + " Тон " + "Model: " + getModel());
    }
}
