package model;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double averageofsubject;

    public Student(String id, String name, int age, String gender, String address, double averageofsubject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.averageofsubject = averageofsubject;
    }
    public Student(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAverageofsubject() {
        return averageofsubject;
    }

    public void setAverageofsubject(double averageofsubject) {
        this.averageofsubject = averageofsubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", averageofsubject=" + averageofsubject +
                '}';
    }
}
