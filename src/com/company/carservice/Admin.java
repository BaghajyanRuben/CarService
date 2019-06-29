package com.company.carservice;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private int profit;
    private List<Car> cars = new ArrayList<>();

    public int getProfit() {
        return profit;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    private void incrementProfit(int carPrice){
        profit += carPrice;
    }

    public void printCarList(){
        int index = 0;
        for (Car car : cars) {
            System.out.println(index + " " + car.toString());
            index ++;
        }
        System.out.println("current profit = " + profit);
    }

    public void saleCar(int index){
        Car car = cars.get(index);
        incrementProfit(car.getPrice());
        cars.remove(car);
        System.out.println("Congratulations !!! you bought a new Car -> " + car.getModel().getName());
    }
}
