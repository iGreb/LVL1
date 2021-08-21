package ru.geekbrains.j1l5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private long phoneNumber;
    private float salary;
    private int age;

    public Employee(String fullName, String position, String email, long phoneNumber, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(fullName + ", " + position + ", " + email + ", " + phoneNumber + ", " + salary + " USD, " + age + " years old");
    }

    public int getAge() {
        return age;
    }
}
