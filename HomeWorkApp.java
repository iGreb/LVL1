package ru.geekbrains.j1l6;

public class HomeWorkApp {
    public static void main(String[] args) {
        Cat cat_1 = new Cat("Barsik");
        cat_1.run(150);
        cat_1.swim(100);

        Dog dog_1 = new Dog("Bobik");
        dog_1.run(300);
        dog_1.swim(2);
    }
}
