package lesson1;

import java.util.Random;
import java.util.Scanner;


public class Lesson4 {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;


    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final String EMPTY_COLUMN_FIRST = "  ";
    public static final String EMPTY = " ";


    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();




    public static void main(String[] args) {


        initMap();


        printMap();


        playGame();


    }


    private static void playGame() {


        while (true) {
            //ход человека
            humanTurn();
            printMap();
            if (checkEnd(DOT_X, "Вы победили!")) {
                System.exit(0);
            }


            //ход ИИ
            aiTern();
            printMap();
            if (checkEnd(DOT_O, "Железо тебя покарало!")) {
                System.exit(0);
            }


        }
    }




    private static boolean checkEnd (char symbol, String winMessage){


        if (checkWin(symbol)) {
            System.out.println(winMessage);
            return true;
        }


        if (isMapFull()) {
            System.out.println("Вы пытались..");
            return  true;
        }


        return false;
    }


    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }


 /*   private static boolean checkWin(char symbol) {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;
        return false;


    }*/
    //проверка по диагоналям
   /*         private static boolean checkWin(char symbol) {
            boolean toright, toleft;
            toright = true;
            toleft = true;
            for (int i=0; i<3; i++) {
                toright &= (map[i][i] == symbol);
                toleft &= (map[3-i-1][i] == symbol);
            }

            if (toright || toleft) return true;

            return false;
        }*/
    //проерка по горизонтали и вертикали
/*       private static boolean checkWin(char symbol) {
            boolean cols, rows;
            for (int col=0; col<3; col++) {
                cols = true;
                rows = true;
                for (int row=0; row<3; row++) {
                    cols &= (map[col][row] == symbol);
                    rows &= (map[row][col] == symbol);
                }

                if (cols || rows) return true;
            }

            return false;
        }*/




    private static boolean checkWin(char symbol) {
        boolean cols, rows;
        boolean toright, toleft;
        for (int col=0; col<3; col++) {
            cols = true;
            rows = true;
            toright = true;
            toleft = true;
            for (int row=0; row<3; row++) {
                cols &= (map[col][row] == symbol);
                rows &= (map[row][col] == symbol);


                for (int i=0; i<3; i++) {
                    toright &= (map[i][i] == symbol);
                    toleft &= (map[3-i-1][i] == symbol);
                }
            }


            if (cols || rows || toright || toleft) return true;
        }


        return false;
    }






    private static void humanTurn() {
        int rowNumber, colNumber;


        do {
            System.out.println("Ход пользователя! Введите номер строки и столбца");
            System.out.print("Строка = ");
            rowNumber = scanner.nextInt();
            System.out.print("Столбец = ");
            colNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber, colNumber));




        map[rowNumber - 1][colNumber - 1] = DOT_X;
    }


    private static void aiTern() {
        int rowNumber, colNumber;


        do {
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, colNumber));




        map[rowNumber - 1][colNumber - 1] = DOT_O;
    }


    private static boolean isCellValid(int rowNumber, int colNumber) {


        if ((rowNumber < 1 || rowNumber > SIZE) || (colNumber < 1 || colNumber > SIZE)) {
            System.out.println("\nПроверьте значения строки и столбца");
            return false;
        }
        if (map[rowNumber - 1][colNumber - 1] != DOT_EMPTY) {
            System.out.println("\nВы выбрали занятую ячейку");
            return false;


        }


        return true;
    }


    private static void printMap() {
        printMapHeader();


        printMapRows();
    }


    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void printMapHeader() {
        System.out.print(EMPTY_COLUMN_FIRST);
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
        }
        System.out.println();
    }


    private static void initMap() {
        map = new char[SIZE][SIZE];


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }


    private static void printColumnNumber(int i) {
        int columnNumber = i + 1;
        System.out.print(columnNumber + EMPTY);
    }

}
