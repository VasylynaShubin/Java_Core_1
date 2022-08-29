package javacoreiface;

import javacoreiface2.MyCalculator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Завдання 1");
        PayPerHour ph1 = new PayPerHour();
        ph1.salary(160, 80);
        FixedPay fp2 = new FixedPay();
        fp2.salary();

        System.out.println("Завдання 2");
        MyCalculator calc = new MyCalculator();
        calc.minus(50, 20);
        calc.plus(23, 16);
        calc.multiply(7, 8);
        calc.devide(63, 7);
    }
}
