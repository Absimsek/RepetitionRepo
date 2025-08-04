package JUL2025.JUL08.Polymorphism;

public class Honda extends Car {
    @Override
    void price(int n) {
        n=n*n;//is an override made from child class
        super.price(n);
    }
}
