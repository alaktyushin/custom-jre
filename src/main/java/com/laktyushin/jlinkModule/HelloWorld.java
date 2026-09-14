package com.laktyushin.jlinkModule;

import java.util.logging.Logger;

public class HelloWorld {

    private static final Logger LOG = Logger.getLogger(HelloWorld.class.getName());

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello and welcome!");
        LOG.info("Hello World!");

        Thread.sleep(5_000);
    }
}