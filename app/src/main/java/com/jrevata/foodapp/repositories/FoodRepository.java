package com.jrevata.foodapp.repositories;

import com.jrevata.foodapp.models.Food;

import java.util.ArrayList;
import java.util.List;


public class FoodRepository {

    private static List<Food> foods = new ArrayList<>();

    static{
        foods.add(new Food("Jordan Sandwich" , "15-30 MIN" , 20.0 , "jsandiwch"));
        foods.add( new Food("Revata Sandwich" , "20-30 MIN" , 15.0 , "rsandwich") );
        foods.add( new Food("Cuela Sandwich" , "25-30 MIN" , 50.0 , "jsandiwch") );
        foods.add( new Food("Axel Sandwich" , "27-30 MIN" , 100.0 , "rsandwich") );



    }

    public static List<Food> getList(){
        return foods;
    }
}
