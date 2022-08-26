package javacore;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.voice() + ", " + dog.voice() + ", " + cow.voice());

        System.out.println("Task 2");
        Burger plainBurger = new Burger("wheat bun", "beef", "mayo");
        Burger newBurger = new Burger();
        
        System.out.println("Task 3");
        Frog frog = new Frog();
        Amphibia amph = (Amphibia) frog;
        frog.sleep();
        frog.eat();
        frog.hangOut();
        frog.swim();
        
        
    }

}
