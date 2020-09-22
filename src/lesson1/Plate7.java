package lesson1;

public class Plate7 {
    private int feed;


    public Plate7(int feed) {
        this.feed = feed;
    }


    public void info() {
        System.out.println("В миске " + feed + "г корма");
    }




    public boolean decreaseFeed(int feed) {
        if (feed > this.feed) {
            System.out.println("Всё съели.");
            return false;
        }
        this.feed -= feed;
        return true;
    }




    public void additiveFeed(int feed) {
        this.feed += feed;
    }


}
