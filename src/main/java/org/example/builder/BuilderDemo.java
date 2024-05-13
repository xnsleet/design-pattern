package org.example.builder;

import org.example.builder.meal.Meal;
import org.example.builder.meal.MealBuilder;

/**
 * 建造者模式（创建型模式）：
 *      将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * 主要解决：
 *      主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；
 *      由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 * 使用场景：
 *      1、需要生成的对象具有复杂的内部结构。
 *      2、需要生成的对象内部属性本身相互依赖。
 * 建造者模式在创建复杂对象时非常有用，特别是当对象的构建过程涉及多个步骤或参数时。它可以提供更好的灵活性和可维护性，同时使得代码更加清晰可读。
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
