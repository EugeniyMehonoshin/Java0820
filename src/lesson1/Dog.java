package lesson1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.type = "Пёс";
        this.maxRun = random.nextInt(300) + 300;
        this.maxSwim = random.nextInt(6) + 5;
        this.maxJump = Math.random() * 0.7 + 0.1;
    }

}
