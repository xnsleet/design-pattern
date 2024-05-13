package org.example.nullObject;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class CustomerFactory {

    private static final String[] names ={"tom","jack","mack"};

    public static AbstractCustomer getCustomer(String name){
        for (String s : names) {
            if (s.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
