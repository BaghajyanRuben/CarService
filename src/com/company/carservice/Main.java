package com.company.carservice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin();

        Scanner scanner = new Scanner(System.in);

        showMenu(scanner, admin);

    }

    private static void showMenu(Scanner scanner, Admin admin) {
        System.out.println("1. add new car 2. show Car list");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                createNewCar(scanner, admin);
                break;
            case 2:
                admin.printCarList();
                carSale(scanner, admin);
                admin.printCarList();
                break;
            default:
                showMenu(scanner, admin);
        }

    }

    private static void carSale(Scanner scanner, Admin admin){
        System.out.println("select car you want to buy");
        int index = scanner.nextInt();

        if (index >= 0 && index < admin.getCars().size()){
            admin.saleCar(index);
        } else {
            carSale(scanner, admin);
        }
    }

    private static void createNewCar(Scanner scanner, Admin admin){
        Model model = chooseModelMenu(scanner);

        System.out.println("input price");
        int price = scanner.nextInt();

        System.out.println("input year");
        int year = scanner.nextInt();

        Car car = new Car(model, year, price);

        admin.addCar(car);
        showMenu(scanner, admin);
    }

    private static Model chooseModelMenu(Scanner scanner) {
        System.out.println("choose car model");
        System.out.println("1. BMW 2.MERCEDES 3.KIA 4.VAZ 5.ERAZ");
        int choosenValue = scanner.nextInt();
        Model model = chooseModel(choosenValue);
        while (model == Model.NO_SELECTED) {
            model = chooseModelMenu(scanner);
        }

        return model;
    }

    private static Model chooseModel(int number) {
        switch (number) {
            case 1:
                return Model.BMW;
            case 2:
                return Model.MERCEDES;
            case 3:
                return Model.KIA;
            case 4:
                return Model.VAZ;
            case 5:
                return Model.ERAZ;
            default:
                return Model.NO_SELECTED;
        }
    }

}
