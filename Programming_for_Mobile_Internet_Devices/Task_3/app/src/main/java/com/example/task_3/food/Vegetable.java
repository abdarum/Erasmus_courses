package com.example.task_3.food;

public class Vegetable extends FoodItem {

    public Vegetable(String name, float price, String imageName, float quantity) {
        super(name, price, quantity, imageName, FoodItemType.Vegetable);
    }
}
