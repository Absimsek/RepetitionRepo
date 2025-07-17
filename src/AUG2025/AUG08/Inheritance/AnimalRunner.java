package AUG2025.AUG08.Inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        Bird b1= new Bird();
        Cat c1=new Cat();
        Dog d1=new Dog();


        b1.sound();
        b1.eat();
        b1.drink();

        c1.sound();
        c1.eat();
        c1.drink();

        d1.sound();
        d1.eat();
        d1.drink();

        //eat() and drink()
    }
}
