package org.example.builder.meal;

import org.example.builder.item.burger.ChickenBurger;
import org.example.builder.item.burger.VegBurger;
import org.example.builder.item.coldDrink.Coffer;
import org.example.builder.item.coldDrink.Tea;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coffer());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Tea());
        return meal;
    }
}
