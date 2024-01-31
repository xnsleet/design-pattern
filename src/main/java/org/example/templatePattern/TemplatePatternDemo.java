package org.example.templatePattern;

/**
 * 模板模式
 * 解释：（复用和扩展）
 *  封装不变部分，扩展可变部分，符合开闭原则
 *  父类定义一系列算法的步骤
 *  子类可以实现/重写某些步骤
 *  不会改变父类这些步骤的执行顺序
 * 缺点：
 *  过分使用会导致子类的泛滥
 * 解决：
 *  解决子类的泛滥可以用回调
 *
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        HappyPeople happyPeople = new HappyPeople();
        HappyPeople planHappyPeople = new Plan();
        happyPeople.test();
        System.out.println("-------------模板模式使用后-------------");
        planHappyPeople.test();
    }
}
