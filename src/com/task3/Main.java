package com.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("задача 3. таблица умножения ");
        for (int i = 1; i <= 10; i++) {
            for (int y = 1; y <= 10; y++) {
                System.out.print(i + "x" + y + "=" + i * y + " ");
            }
            System.out.println();
        }
    }
}