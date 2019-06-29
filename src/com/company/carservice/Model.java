package com.company.carservice;

public enum Model {
    BMW("BMW"),
    MERCEDES("Mercedes"),
    KIA("KIA"),
    PORCHE("Porche"),
    VAZ("VAZ"),
    ERAZ("Eraz"),
    NO_SELECTED("nan");

    private String name;
    Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
