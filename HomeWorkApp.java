package ru.geekbrains.j1l2;

public class HomeWorkApp {
    public static void main(String[] args) {
        fromTenToTwenty(5, 15);
        positiveNegative(-1);
        trueOrFalse(10);
        wordAndNumber("Name", 3);
        leapYear(1984);
    }

    public static boolean fromTenToTwenty(int a, int b) {
        if(a + b >= 10 && a + b <= 20) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void positiveNegative(int a) {
        if(a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }

    }

    public static boolean trueOrFalse(int a) {
        if(a < 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void wordAndNumber(String word, int number) {
        for(int a = 0; a < number; a++) {
            System.out.println(word);
        }
    }

    public static void leapYear(int year) {
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}