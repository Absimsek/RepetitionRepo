package AUG2025.AUG08.Polymorphism;

public class Honda extends Car {
    @Override
    void price(int n) {
        n=n*n;//is an override made from child class
        super.price(n);
    }
}
