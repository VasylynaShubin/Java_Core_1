package javacoreiface2;

import javacoreiface1.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public void plus(int a, int b) {
       int c = a + b;
     System.out.println("Сума = " + c);
    }

    @Override
    public void minus(int a, int b) {
        int c = a - b;
        System.out.println("Різниця = " + c);
            }

    @Override
    public void multiply(int a, int b) {
        int c = a * b;
        System.out.println("Добуток = " + c);
    }

    @Override
    public void devide(int a, int b) {
        int c = a / b;
        System.out.println("Частка = " + c);
    }

}
