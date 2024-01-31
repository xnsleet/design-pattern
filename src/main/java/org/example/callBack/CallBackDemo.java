package org.example.callBack;

/**
 * 回调
 * 解释：
 *  回调表示一段可执行逻辑的引用（或者是指针），我们把改引用（或者是指针）传递到另一段逻辑（或是方法）里，供这段逻辑适时调用。
 *
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class CallBackDemo {

    public static void main(String[] args) {
        A a = new A();
        a.solve("这是答案XXXXX", new ResultHandler() {
            @Override
            public void handle() {
                System.out.println("问题就这么解决了！");
            }
        });
    }
}
