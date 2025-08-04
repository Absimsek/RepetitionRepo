package JUL2025.JUL08.Polymorphism;

public class Car {

    void engine(){
        System.out.println("engine has started");
    }

    void price(int n){
        n=n*1000;
        System.out.println(n);
    }

    void price(int n,int k){// is an overload for price method
        n=n*k;
        System.out.println(n);
    }
}
