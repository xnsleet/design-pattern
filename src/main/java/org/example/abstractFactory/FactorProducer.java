package org.example.abstractFactory;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class FactorProducer{

    public static AbstractFactory getFactory(String choice){
        if (choice.equals("Shape")){
            return new ShapeFactory();
        }else if (choice.equals("Color")){
            return new ColorFactory();
        }
        return null;
    }
}
