package AUG2025.AUG09.Interface;

public class Accord implements Ac,Engine,Security{
    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Engine runs super");
    }
}
