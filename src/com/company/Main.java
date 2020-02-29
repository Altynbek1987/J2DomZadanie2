package com.company;

public abstract class Main {

    public static void main(String[] args) {
        createObject("Гусеничный").print();
        createObject("Колесный").print();
        createObject("Компактный").print();
    }
    public static Printable createObject (String className){
        Printable print = null;
        switch (className){
            case "Гусеничный":
                print = new Big(30,"R3000LC-7","Гусеничный");
                break;
            case "Колесный":
                print = new Medium(14, "R1400W-7","Колесный");
                break;
            case "Компактный":
                print = new Little(5, "R555W-7", "Компактный ");
                break;
        }
        return print;
    }


}
