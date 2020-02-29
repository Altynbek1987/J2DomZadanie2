package com.company;

public class Little extends Excavator{
    private String compact;

    public String getCompact() {
        return compact;
    }

    public Little(int weight,String model, String compact) {
        super(weight,model);
        this.compact = compact;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Little: " + getCompact());
    }


}
