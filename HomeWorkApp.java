package ru.geekbrains.j1l3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        zeroOne();
        fromOneToHundred();
        changeArray();
        diagonal();
        initValue(5, 6);

    }

    public static void zeroOne() {
        int[] num = {1, 0, 0, 1, 1};
        for(int b = 0; b < num.length; b++) {
            if(num[b] == 1) {
                num[b] = 0;
            } else {
                num[b] = 1;
            }
        }
        System.out.println(Arrays.toString(num));
    }

    public static void fromOneToHundred() {
        int[] n = new int[100];
        n[0] = 1;
        for(int i = 0; i < n.length; i++) {
            n[i] = i + 1;
        }
        System.out.println(Arrays.toString(n));
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int n = 0; n < arr.length; n++) {
            if(arr[n] < 6) {
                arr[n] = arr[n] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void diagonal() {
        int[][] in = new int[4][4];
        for(int a = 0; a < in.length; a++) {
            for(int b = 0; b < in.length; b++) {
                int sum = a + b;
                if(sum == 3) {
                    in[a][b] = 1;
                } else if(a == b) {
                    in[a][b] = 1;
                } else {
                    in[a][b] = 5;
                }
                System.out.print(in[a][b] + " ");
            }
            System.out.println();
        }
    }

    public static int[] initValue(int len, int initialValue) {
        int[] arr = new int[len];
        for(int i = 0; i <arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

}



