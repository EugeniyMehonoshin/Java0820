package lesson1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.maxJump = 2.0;
        this.maxRun = random.nextInt(50) + 150;
        this.type = "Кот";
    }


    @Override
    public void swim(int dist) {
        System.out.println("Коты не умеют плавать!");


    }

}
