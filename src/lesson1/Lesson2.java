package lesson1;

public class Lesson2 {
    //задание 1
    public static void task1(String[] args) {
        System.out.println("task1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");
        }

    }

    //задание 2
    public static void task2(String[] args) {
        System.out.println("task2");
        int[] arr = new int[8];
        for (int i = 1, j = 0; i < arr.length; i++) arr[i] = j += 2;
        for (int x : arr) System.out.print(x + " ");
    }

    //задание 3
    public static void task3(String[] args) {
        System.out.println("task3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    //задание 4
    public static void task4(String[] args) {
        System.out.println("task4");
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, j2 = arr[i].length; j < arr[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }

    //задание 5
    public static void task5(String[] args) {
        System.out.println("task5");
        int[] arr = {10, 6, 3, 2, 7, 5, 4, 8, 9, 1};
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.println("Min: " + i);
                return;
            }
            if (arr[i] > max) {
                max = arr[i];
                System.out.println("Max: " + i);
                //return;
            }   //не получается без интернета..


        }
    }

    //задание 6
    public static void task6(String[] args) {
    }
    // не успел..

    //задание 7 (могло бы быть тут..)
}
