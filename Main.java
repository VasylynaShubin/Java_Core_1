package javacore;

public class Main {

    public static void main(String[] args) {
        Robot justRobot = new Robot();
        justRobot.work();
        CoffeeRobot cRobot = new CoffeeRobot();
        cRobot.work();
        RobotDancer dRobot = new RobotDancer();
        dRobot.work();
        RobotCooker Robocook = new RobotCooker();
        Robocook.work();

        System.out.println("Завдання з масивом");
        Robot[] Robots = {justRobot, Robocook, dRobot, cRobot};

        for (int i = 0; i < Robots.length; i++) {
            Robots[i].work();
        }

        Animal a1 = new Animal("Леопард", 20, 7);
        System.out.println("Назва тварини = " + a1.getName() + ", швидкість тварини = " + a1.getSpeed() + " км/год, вік тварини = " + a1.getAge() + " років");

        a1.setName("Бик");
        a1.setSpeed(2);
        a1.setAge(14);

        System.out.println("Назва тварини = " + a1.getName() + ", швидкість тварини = " + a1.getSpeed() + " км/год, вік тварини = " + a1.getAge() + " років");
    }

}
