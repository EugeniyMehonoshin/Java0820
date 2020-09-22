package lesson1;

public class Main7 {
    public static void main7(String[] args) {


        Cat7[] cats = new Cat7[5];
        cats[0] = new Cat7("Мартин", 15);
        cats[1] = new Cat7("Рыжик", 20);
        cats[2] = new Cat7("Пушок", 27);
        cats[3] = new Cat7("Мурзик", 25);
        cats[4] = new Cat7("Батон", 32);
        Plate7 plate = new Plate7(150);
        plate.info();
        System.out.println("Кормим шерстяных.");
        for (int i = 0; i < cats.length; i++)
            cats[i].eat(plate);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].full) System.out.println("Шерстяной " + cats[i].name + " сыт");
            else System.out.println("Шерстяной " + cats[i].name + " голоден");
        }
        plate.additiveFeed(50);
        System.out.println("В миску добавлен корм.");
        System.out.println("Кормим голодных.");
        for (int i = 0; i < cats.length; i++)
            if (!cats[i].full) cats[i].eat(plate);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].full) System.out.println("Шерстяной " + cats[i].name + " сыт");
            else System.out.println("Шерстяной " + cats[i].name + " голоден");
        }
    }

}
