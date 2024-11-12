package com.qn.spring.quntnex;

public class JavaTrainer {
    private String name;
    private String subject;
    private Address address;

    public JavaTrainer(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public Address getAddress() {
        return address;
    }

  
}
