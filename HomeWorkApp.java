package ru.geekbrains.j1l4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    private static Scanner scanner;
    private static Random random;
    private static char[][] map;

    private static final int SIZE = 3;

    private static final char MAP_ELEMENT_EMPTY = '_';
    private static final char MAP_ELEMENT_X = 'X';
    private static final char MAP_ELEMENT_0 = '0';

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();

        initMap();
        printMap();

        while(true) {
            playerTurn();
            printMap();
            if(checkWin(MAP_ELEMENT_X)) {
                System.out.println("Победа!");
                break;
            }

            if(isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if(checkWin(MAP_ELEMENT_0)) {
                System.out.println("Проигрыш!");
                break;
            }

            if(isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = MAP_ELEMENT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void playerTurn() {
        int x, y;
        do{
            System.out.println("Введите координаты вашего хода (X, Y)");

            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while(!isMoveValid(x, y));

        map[x][y] = MAP_ELEMENT_X;
    }

    public static boolean isMoveValid(int x, int y) {
        if(x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return  false;
        }
        if(map[x][y] != MAP_ELEMENT_EMPTY) {
            return false;
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isMoveValid(x, y));

        map[x][y] = MAP_ELEMENT_0;
        System.out.println("Противник совершил ход в клетку [ " + (x + 1) + ", " + (y + 1) + " ]");
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == MAP_ELEMENT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char element) {
        for (int i = 0; i < SIZE; i++) {
            if((map[i][0] == element && map[i][1] == element && map[i][2] == element)
                    || (map[0][i] == element && map[1][i] == element && map[2][i] == element)) {
                return  true;
            }
            if((map[0][0] == element && map[1][1] == element && map[2][2] == element)
                    || (map[0][2] == element && map[1][1] == element && map[2][0] == element)) {
                return true;
            }
        }
        return false;
    }

}
