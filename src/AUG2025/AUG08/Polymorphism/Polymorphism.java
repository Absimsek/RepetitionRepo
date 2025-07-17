package AUG2025.AUG08.Polymorphism;

public class Polymorphism {
    //polymorphism consists of 2 parts
    //override and overload

    // override is using a class method without changing name and parameters form outside of class so by objects
    // but changing the body of method

    // overload is using a class method from inside of class but changing parameters and body of it

    public static void main(String[] args) {
        Car c1=new Car();
        Honda h1=new Honda();


        c1.engine();
        System.out.println("method normally prints");
        c1.price(10);
        System.out.println("overrided method prints as");
        h1.price(10);
        System.out.println("and overloaded method prints as");
        c1.price(5,15);
        System.out.println("so polymorphism is using same method name but variables or body changes then result changes");
    }
}
