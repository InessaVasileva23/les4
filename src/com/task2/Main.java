package com.task2;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("задача 2. Введено число " + x);

        if (x < 0)
            System.out.print("отрицательное, ");
        else {
            if (x > 0) System.out.print("положительное, ");
            else System.out.print("нулевое, ");
        }
        if ((x % 2) == 0)
            System.out.println("четное");
        else System.out.println("не четное");

    }
}