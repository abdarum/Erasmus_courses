package com.example.task_2.data;

import java.util.ArrayList;

public class CitySource {
    public static ArrayList<City> generateItemsList() {
        ArrayList<City> cites = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            cites.add(new City("City " + i, 9000 + i));
        }
        return  cites;
    }
}
