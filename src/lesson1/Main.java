package lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Пушок");


        Dog dog1 = new Dog("Гендальф");
        Dog dog2 = new Dog("Шарик");


        cat1.info();
        cat2.info();


        System.out.println();


        dog1.info();
        dog2.info();


        System.out.println();


        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.3);


        System.out.println();


        cat1.run(180);
        cat1.swim(0);
        cat1.jump(1.7);


        System.out.println();


        dog2.run(600);
        dog2.swim(4);
        dog2.jump(0.5);


        System.out.println();


        cat2.run(250);
        cat2.swim(0);
        cat2.jump(2.1);




    }

}
