package org.example.builder;

import org.example.builder.meal.Meal;
import org.example.builder.meal.MealBuilder;

/**
 * 建造者模式：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 *
 * @author sleet
 * @version 2024/5/10
 */
public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("totalPrice:" + vegMeal.getPrice());
        vegMeal.showItems();
        System.out.println("-------------------------------------");
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("totalPrice:" + nonVegMeal.getPrice());
        nonVegMeal.showItems();
    }
}
