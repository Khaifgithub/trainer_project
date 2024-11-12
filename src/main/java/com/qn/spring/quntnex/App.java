package com.qn.spring.quntnex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configure.xml");

        JavaTrainer javaTrainer = (JavaTrainer) cpx.getBean("javatrainer");
        SqlTrainer sqlTrainer = (SqlTrainer) cpx.getBean("sqlTrainer");
        WebTrainer webTrainer = (WebTrainer) cpx.getBean("webTrainer");

        
        System.out.println("JavaTrainer Details:");
        System.out.println("Name: " + javaTrainer.getName());
        System.out.println("Subject: " + javaTrainer.getSubject());
        System.out.println("Teaching ID: " + javaTrainer.getAddress().getTeachingId());
        	System.out.println();
       
        System.out.println("SqlTrainer Details:");
        System.out.println("Name: " + sqlTrainer.getName());
        System.out.println("Subject: " + sqlTrainer.getSubject());
        System.out.println("Teaching ID: " + sqlTrainer.getAddress().getTeachingId());
        System.out.println();
        
        System.out.println("WebTrainer Details:");
        System.out.println("Name: " + webTrainer.getName());
        System.out.println("Subject: " + webTrainer.getSubject());
        System.out.println("Teaching ID: " + webTrainer.getAddress().getTeachingId());
    }
}
