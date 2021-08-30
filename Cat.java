package ru.geekbrains.j1l7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void info() {
        System.out.println(name + " " + satiety);
    }

    public void eat(Plate plate) {
        if(plate.getFood() < appetite) {
            System.out.println("Недостаточно еды. " + name + " не наелся и уходит");
            plate.automaticFillPlate(50);
            return;
        }
        plate.fullness(appetite);
        System.out.println(name + " поел из тарелки");
        satiety = true;
    }
}
