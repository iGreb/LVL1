package ru.geekbrains.j1l7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void fullness(int eaten) {
        if((food -= eaten) < 0) {
            food = 0;
        }
    }

    public int getFood() {
        return food;
    }

    public void automaticFillPlate(int fill) {
            food += fill;
            System.out.println("[Тарелка автоматически пополнилась на " + fill + " еды]");
    }

    public void info() {
        System.out.printf("[Остаток еды в тарелке: %d]\n", food);
    }
}
