package javacore;

public class Main {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        rec1.square();
        rec1.perymetr();

        Rectangle rec2 = new Rectangle(48, 6);
        rec2.square();
        rec2.perymetr();

        Kolo kolo1 = new Kolo(4, 8);
        kolo1.square();
        kolo1.length();
    }
}
