package com.code.java8.methodrefrence;

/**
 * Created by Himangshu Gorai on 1/11/2022.
 */
public class ConstructorReference {

    public static void main(String[] args) {
        Messageable messageable = Message::new;

        messageable.getMessage("Hello Reference to a constructor");
    }
}
