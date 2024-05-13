package org.example.iterator;

/**
 * 迭代器模式（行为型模式）：
 *      提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 主要解决：
 *      不同的方式来遍历整个整合对象。
 * 使用场景：
 *      1、访问一个聚合对象的内容而无须暴露它的内部表示。
 *      2、需要为聚合对象提供多种遍历方式。
 *      3、为遍历不同的聚合结构提供一个统一的接口。
 * @author sleet
 * @version 2024/5/13
 */
public class IteratorDemo {

    public static void main(String[] args) {
        String[] names ={"tom", "jack", "mack"};
        NameRepository nameRepository = new NameRepository(names);
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
