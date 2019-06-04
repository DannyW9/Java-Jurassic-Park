package AltJurassicPark;

public class Visitor {

    private int age;
    private int height;
    private int wallet;

    public Visitor(int age, int height, int wallet){
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWallet() {
        return wallet;
    }
}
