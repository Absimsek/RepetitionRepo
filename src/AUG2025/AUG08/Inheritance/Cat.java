package AUG2025.AUG08.Inheritance;

public class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("cats can meow ");
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void drink() {
        super.drink();
    }
}
