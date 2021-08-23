package ru.geekbrains.j1l6;

public class Animals {
    protected String name;
    protected int meters;

    public void run(int meters) {
        System.out.println(name + " пробежал(а) " + meters + " метров(а)");
    }

    public void swim(int meters) {
        System.out.println(name + " проплыл(а) " + meters + " метров(а)");
    }


}
