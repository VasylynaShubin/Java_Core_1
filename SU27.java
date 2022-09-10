package javacore;

public class SU27 extends Plane implements TurboAcceleration, TechnologyStels, NuclearAttack {

    int maxspeed;
    String color;

    public void su27(int maxSpeed, String color) {
        this.maxspeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void turboAcceleration() {
        System.out.println("Літак прискорився на " + MyRandom.randomNumber(this.maxspeed, this.maxspeed + 1000) + "км");
    }

    @Override
    public void technologyStels() {
        System.out.println("Літака не видно протягом " + MyRandom.randomNumber(0, 60) + "с");
    }

    @Override
    public void nuclearAttack() {
        System.out.println("Літак скинув " + MyRandom.randomNumber(0, 10) + " ядерних боєголовок");
    }

}
