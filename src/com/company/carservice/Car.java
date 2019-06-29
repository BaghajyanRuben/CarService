package com.company.carservice;

public class Car {
    private Model model;
    private int year;
    private int price;

    public Car(Model model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Model getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Model = " + model.getName() + " year = " + year + " price = " + price;
    }
}
