package com.example.task_2.data;

public class City {
    private String name;
    private int PostCode;

    public City(String name, int postCode) {
        this.name = name;
        PostCode = postCode;
    }

    public String getName() {
        return name;
    }

    public int getPostCode() {
        return PostCode;
    }
}