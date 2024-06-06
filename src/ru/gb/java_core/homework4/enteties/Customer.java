package ru.gb.java_core.homework4.enteties;

public class Customer {

    private static int userCounter = 0;
    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private Gender gender;

    {
        id += userCounter;
    }

    public Customer(String name, int age, String phoneNumber, Gender gender) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", genders=" + gender +
                '}';
    }
}
