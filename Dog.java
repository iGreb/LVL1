package ru.geekbrains.j1l6;

public class Dog extends Animals {

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int meters) {
        if(meters > 500 || meters <= 0) {
            System.out.println(name + " столько пробежать не сможет");
        } else {
            System.out.println(name + " пробежал(а) " + meters + " метров(а)");
        }
    }

    @Override
    public void swim(int meters) {
        if(meters > 10 || meters <= 0) {
            System.out.println(name + " столько проплыть не сможет");
        } else {
            System.out.println(name + " проплыл(а) " + meters + " метров(а)");
        }
    }
}
