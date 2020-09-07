package lesson1;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    private static Random random = new Random();


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        do {
            int Comp = random.nextInt(10);
            System.out.println("Угдай число с 3 попыток от 0 до 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введи свой ответ: (для выхода из игры, просто нажмите Enter)");
                int quest = scanner.nextInt();
                if (quest == Comp) {
                    System.out.println("Вы угадали число, молодец!");
                    break;
                }
                System.out.println(quest > Comp ? "Введенное чилсо больше " : "Введенное число меньше ");
                System.out.println((i - 1) > 0 ? " у вас осталось " + (i - 1) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
    }

}
