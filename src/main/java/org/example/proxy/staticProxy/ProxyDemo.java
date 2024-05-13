package org.example.proxy.staticProxy;

/**
 * 代理模式：
 *      为其他对象提供一种代理以控制对这个对象的访问。
 * 主要解决：
 *      在直接访问对象时带来的问题，比如说：
 *      要访问的对象在远程的机器上。在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），
 *      直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 * 使用场景：
 *      按职责来划分，通常有以下使用场景：
 *      1、远程代理。
 *      2、虚拟代理。
 *      3、Copy-on-Write 代理。
 *      4、保护（Protect or Access）代理。
 *      5、Cache代理。
 *      6、防火墙（Firewall）代理。
 *      7、同步化（Synchronization）代理。
 *      8、智能引用（Smart Reference）代理。
 *
 * @author sleet
 * @version 2024/4/11
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Person person = new Student();
        new StudentProxy(person).say("student hello");
    }
}
