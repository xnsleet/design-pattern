package org.example.interpreter;

/**
 * 解释器模式（行为型模式）：
 *      给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
 * 主要解决：
 *      对于一些固定文法构建一个解释句子的解释器。
 * 使用场景：
 *      1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。
 *      2、一些重复出现的问题可以用一种简单的语言来进行表达。
 *      3、一个简单语法需要解释的场景。
 *
 * @author sleet
 * @version 2024/5/13
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        AndExpression andExpression = getAndExpression();
        OrExpression orExpression = getOrExpression();
        System.out.println(andExpression.interpreter("tom jack"));
        System.out.println(orExpression.interpreter("jane"));
    }

    private static OrExpression getOrExpression() {
        TerminalExpression jane = new TerminalExpression("jane");
        TerminalExpression marry = new TerminalExpression("marry");
        return new OrExpression(jane,marry);
    }

    private static AndExpression getAndExpression() {
        TerminalExpression tom = new TerminalExpression("tom");
        TerminalExpression jack = new TerminalExpression("jack");
        return new AndExpression(tom,jack);
    }
}
