package ru.geekbrains.j1l7;

public class HomeWorkApp {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Murzik", 20),
                new Cat("Barsik", 30),
                new Cat("Matroskin", 50)
        };

        Plate plate = new Plate(40);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
            cats[i].info();
        }
    }
}
