package ru.geekbrains.j1l6;

public class Cat extends Animals {

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int meters) {
        if(meters > 200 || meters <= 0) {
            System.out.println(name + " столько пробежать не сможет");
        } else {
            System.out.println(name + " пробежал(а) " + meters + " метров(а)");
        }
    }

    @Override
    public void swim(int meters) {
        System.out.println(name + " не умеет плавать, потому что кот(шка)");
    }
}
