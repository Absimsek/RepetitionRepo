package AUG2025.AUG09.Interface;

public class Civic implements Ac,Engine,Security{
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("AC runs super");
    }
}
