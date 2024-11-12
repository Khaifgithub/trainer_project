package com.qn.spring.quntnex;

public class Address {
    private int teachingId;

    public int getTeachingId() {
        return teachingId;
    }

    public void setTeachingId(int teachingId) {
        this.teachingId = teachingId;
    }

    public Address(int teachingId) {
        super();
        this.teachingId = teachingId;
    }

    public Address() {
        super();
    }
}
