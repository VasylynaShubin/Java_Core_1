package javacore;

import java.util.Random;

public class MyRandom {
     public static int randomNumber(int start, int finish) {
        Random random = new Random();
        int r = random.nextInt(finish - start) + start;
        return r;
     }
        
         public static double randomDouble(int start, int finish) {
        Random randomdouble = new Random();
        double r1 = ((finish - start) + start)*randomdouble.nextDouble();
        return r1;
    }
}
