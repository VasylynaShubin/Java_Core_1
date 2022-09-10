package javacore;

public class AircraftControl {

    void moveUp() {
        System.out.println("Літак летить вгору на " + MyRandom.randomNumber(0, 1000) + "км");
    }

    void moveDown() {
        System.out.println("Літак летить вниз на " + MyRandom.randomNumber(0, 1000) + "км");
    }

    void moveLeft() {
        System.out.println("Літак летить вліво на " + MyRandom.randomNumber(0, 10000) + "км");
    }

    void moveRight() {
        System.out.println("Літак летить вправо на " + MyRandom.randomNumber(0, 10000) + "км");
    }
}
