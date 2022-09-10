package javacore;
public abstract class Plane extends AircraftControl{
    double weight;
    double length;
    double width;
    
  void launchingEngines(){
  System.out.println("Запуск двигунів. До вильоту залишилося " + MyRandom.randomNumber(20, 88) + "с");
  }  
  void takeoff(){
  System.out.println("На повному баку палива літак пролетить " + MyRandom.randomDouble(0, 1000) + "км");
  } 
  void landing(){
  System.out.println("Літак йде на посадку");
  } 
}
