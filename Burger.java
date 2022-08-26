
package javacore;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String salad;
    String sauce;
    
    Burger(String bun, String meat, String sauce){
        this.bun = bun;
        this.meat = meat;
        this.sauce = sauce;
        System.out.println("Here is your burger with " + this.bun + ", " + this.meat + " and " + this.sauce);
       
    }
    
     Burger(){
         this("black bun", "pork", "ketchup");
         System.out.println("This burger is called from another constructor");
    }
}
