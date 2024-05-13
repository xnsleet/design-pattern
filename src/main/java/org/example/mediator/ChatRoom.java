package org.example.mediator;

import java.util.Date;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
