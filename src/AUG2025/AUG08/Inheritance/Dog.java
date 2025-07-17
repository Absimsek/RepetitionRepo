package AUG2025.AUG08.Inheritance;

public class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("dogs can bark");
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
