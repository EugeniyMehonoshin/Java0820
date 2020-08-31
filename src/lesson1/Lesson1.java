package lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Доброго времени суток!");
    }

    //задание 2
    public static void task2() {
        byte a = 100;
        System.out.println("a");

        short b = 10000;
        System.out.println(b);

        int c = 1_000_000_000;
        System.out.println(c);

        long d = 1_000_000_000_000_000_000L;
        System.out.println(d);

        float f = 123456.654321f;
        System.out.println(f);

        double g = 123456.654321;
        System.out.println(g);

        char h = '.';
        System.out.println(h);

        boolean j = true;
        System.out.println(j);
    }

    //задание 3
    public static void task3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        double sum = a * (b + ((double)c / d));
        System.out.println("Итого: + sum");

    }

    //задание 4
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            System.out.println("true");
        } else System.out.println("false");

    }

    //задание 5
    public static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите любое число");
        int a = in.nextInt();
        if(a >= 0) {
            System.out.println("Полжительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    //задание 6
    public static void task6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        if (a < 0) {
            System.out.println("true");
        }
    }

    //задание 7
    public static void task7(String name) {
        System.out.println("Привет, " + name + " ! ");
    }

    //задание 8
    public static void task8(int year) {
        System.out.println("\nЗадание 8.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");

    }
}
