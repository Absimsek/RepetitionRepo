package AUG2025.AUG8.Inheritance;

public class Bird extends Animal {

    @Override
    void sound() {
        System.out.println("birds can whistle");
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
