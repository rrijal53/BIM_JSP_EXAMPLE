package com.rowsun;

public class Student {
    private String name;
    private String address;

    public Student() {

    }

    public String addNumber(int n, int mm) {
        return "java bean example , sum : " + (n + mm);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}