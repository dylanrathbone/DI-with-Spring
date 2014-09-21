package com.dylanrathbone.interfacesfun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[]args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Client myClient = (Client)context.getBean("Client");
        myClient.callDataSourceMethods();
    }
}
