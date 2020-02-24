package example.controller;

import java.util.Properties;

public class demoTest {

    public static void main(String[] args) {
        Properties pro =System.getProperties();
        System.out.println(pro.getProperty("user.name"));
    }
}
