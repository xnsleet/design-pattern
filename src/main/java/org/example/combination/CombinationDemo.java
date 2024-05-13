package org.example.combination;

/**
 * 组合模式：
 *      将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * 主要解决：
 *      它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。
 * 使用场景：
 *      部分、整体场景，如树形菜单，文件、文件夹的管理。
 *
 * @author sleet
 * @version 2024/5/11
 */
public class CombinationDemo {

    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Robert");
        Leaf leaf2 = new Leaf("Laura");
        Leaf leaf3 = new Leaf("Bob");
        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);
        composite.add(leaf3);

        //打印该组织的所有员工
        System.out.println(composite);
        for (Component component : composite.getSubordinates()) {
            System.out.println(component);
        }
    }
}
