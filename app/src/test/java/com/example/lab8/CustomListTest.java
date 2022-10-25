package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jetbrains.annotations.TestOnly;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;


public class CustomListTest {
    private CustomList list;

    @BeforeAll
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);


    }


}
