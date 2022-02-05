package com.company;

public class Main {

    public static void main(String[] args) {
        min();
        max();
    }

    static void min() {
        int[] massiv = new int[10];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        massiv[3] = 4;
        massiv[4] = 5;
        massiv[5] = 6;
        massiv[6] = 7;
        massiv[7] = 8;
        massiv[8] = 9;
        massiv[9] = 10;
        int min = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < min) {
                min = massiv[i];
            }
        }
        System.out.println("Min "+min);
    }

    static void max () {
        int[] massiv1 = new int[10];
        int san = 0;
        massiv1[0] = 1;
        massiv1[1] = 2;
        massiv1[2] = 3;
        massiv1[3] = 4;
        massiv1[4] = 5;
        massiv1[5] = 6;
        massiv1[6] = 7;
        massiv1[7] = 8;
        massiv1[8] = 9;
        massiv1[9] = 10;
        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1[i] > san) {
                san = massiv1[i];
            }
        }
        System.out.println("Max " + san);
    }
}
