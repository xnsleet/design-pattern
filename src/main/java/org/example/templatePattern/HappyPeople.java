package org.example.templatePattern;

/**
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class HappyPeople {

    public void test(){
        buyTicket();
        ride();
        happy();
    }

    public void buyTicket() {
        System.out.println("买票");
    }

    public void ride() {
        System.out.println("坐车");
    }

    public void happy() {
        System.out.println("开心团聚");
    }
}
