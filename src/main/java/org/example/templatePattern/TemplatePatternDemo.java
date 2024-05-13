package org.example.templatePattern;

/**
 * 模板模式（行为型模型）：
 *      定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 主要解决：
 *      一些方法通用，却在每一个子类都重新写了这一方法。
 * 使用场景：
 *      1、有多个子类共有的方法，且逻辑相同。
 *      2、重要的、复杂的方法，可以考虑作为模板方法。
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
