package com.rowsun;
import java.io.*;
public class Student implements Serializable {
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

    public static void main(String[] args) {
        Student obj = new Student();
        s.setName("dsd");
        s.setAddress("add");
        s.getName();
    }
    public boolean save(){
        //connect to db
       //create insert query
       //execute
    }

}