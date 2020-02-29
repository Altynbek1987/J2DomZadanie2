package com.company;

public class Medium extends Excavator {
    private String wheel;

    public String getWheel() {
        return wheel;
    }

    public Medium(int weight,String model, String wheel) {
        super(weight,model);
        this.wheel = wheel;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Medium: " + getWheel());
    }
}
