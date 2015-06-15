package com.mypackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static Logger logger = LogManager.getLogger(Main.class);

    public static void builder() {
        MyClass tmp = new MyClass.Builder(1).setB(2).setC(3).setD("n").build();
        System.out.println(tmp);
    }

    public static void main(String[] args) {

        System.out.println("0.2");
        System.out.println("Hello World!");
        builder();

        logger.info("Taki super projekt!");

    }

}
