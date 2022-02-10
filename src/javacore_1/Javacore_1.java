package javacore_1;

public class Javacore_1 {

    public static void main(String[] args) {
        // Завдання 1
        byte a = 4;
        short b = 25462;
        int c = 145692359;
        long d = 6524252526245278L;
        float e = 2.7552F;
        double f = 1.456824;
        char g = 'a';
        boolean h = true;

        // Завдання 2
        System.out.println("Min byte = " + Byte.MIN_VALUE + " Max byte = " + Byte.MAX_VALUE);
        System.out.println("Min short = " + Short.MIN_VALUE + " Max short = " + Short.MAX_VALUE);
        System.out.println("Min int = " + Integer.MIN_VALUE + " Max int = " + Integer.MAX_VALUE);
        System.out.println("Min long = " + Long.MIN_VALUE + " Max long = " + Long.MAX_VALUE);
        System.out.println("Min float = " + Float.MIN_VALUE + " Max float = " + Float.MAX_VALUE);
        System.out.println("Min double = " + Double.MIN_VALUE + " Max double = " + Double.MAX_VALUE);
        System.out.println("Boolean doesn't have Min or Max values. Its value is always " + Boolean.TRUE + " or " + Boolean.FALSE);
        System.out.println("Min char = " + Character.MIN_VALUE + " Max char = " + Character.MAX_VALUE);

        // Завдання 3
        int[] array1 = {5, 85, 17, 65, 259, 1496, 25634, 96, 1, 6346};

        int i;
        int min = array1[0];
        int max = array1[0];

        for (i = 0; i < 10; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println("Мінімальне значення в масиві = " + min);
        System.out.println("Максимальне значення в масиві = " + max);
    }

}
