package org.example.callBack;

/**
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class A {

    public void solve(String answer, ResultHandler resultHandler) {
        System.out.println("怎么解决？");
        System.out.println(answer);
        resultHandler.handle();
    }
}
