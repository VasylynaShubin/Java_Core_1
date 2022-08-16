package javacore;

public class Rectangle {
    private double length;
    private double width;
    
    Rectangle(){
    this.length = 8;
    this.width = 2;
    }
    
    Rectangle(double length, double width){
    this.length = length;
    this.width = width;
    }
    
    public void square(){
        double square;
        square = this.length * this.width;
        System.out.println("Площа прямокутника = " + square);
    }
    
    public void perymetr(){
        double perymetr;
        perymetr = 2 *(this.length + this.width);
        System.out.println("Периметр прямокутника = " + perymetr);
    }
}
