package lesson1;

import java.util.Random;

public abstract class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;
    public Random random = new Random();


    public Animal(String name) {
        this.name = name;
    }


    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " пробежал " + dist + " м.");
        else System.out.println(this.type + " " + this.name + " не добежал..");
    }


    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " проплыл " + dist + " м.");
        else System.out.println(this.type + " " + this.name + " вода не его стихия.");
    }


    public void jump(double height) {
        if (this.maxJump >= height)
            System.out.println(this.type + " " + this.name + " прыгнул " + height + " м.");
        else System.out.println(this.type + " " + this.name + " не допрыгнул.");
    }


    public void info() {
        System.out.println(this.type + " " + this.name + " пробежал: " + this.maxRun + " м., проплывает: " + this.maxSwim + " м., прыгает: " + this.maxJump + " м.");
    }

}
