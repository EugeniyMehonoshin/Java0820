package lesson1;

public class Cat7 {
    String name;
    private int appetite;
    boolean full;


    public Cat7(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }


    public void eat(Plate7 p) {
        if (p.decreaseFeed(appetite)) this.full = true;
    }

}
