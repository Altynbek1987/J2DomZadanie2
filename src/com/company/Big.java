package com.company;

public class Big extends Excavator {
    private String caterpillar;

    public String getCaterpillar() {
        return caterpillar;
    }

    public Big(int weight,String model, String caterpillar) {
        super(weight,model);
        this.caterpillar = caterpillar;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Big: " + getCaterpillar());
    }
}
