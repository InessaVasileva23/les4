package com.task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("задача 4. Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел. ");
        int n = 20;
        int d = 2;
        int a = 2;

        int i = 1;
        while (i <= n) {
            System.out.print(a + (i - 1) * d + " ");
            i++;
        }


    }
}