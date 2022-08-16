
package javacore;

public class Kolo {
    private double radius;
    private double diametr;
    
    Kolo(double radius, double diametr){
        this.radius = radius;
        this.diametr = diametr;
    }
    
    public void square(){
    double square = Math.pow(this.diametr/2,2) * Math.PI;
    System.out.println("Площа кола = " + square);
    }
    
    public void length(){
        double length = 2 * Math.PI * this.radius;
        System.out.println("Довжина кола = " + length);
    }
    
    
    
    
    
    
    
    
    
    
}
    
