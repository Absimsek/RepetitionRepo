package AUG2025.AUG9.Abstraction;

public class grade8 extends Courses{
    //IDE gives error if abstract method not overrided here
    // try to delete overrided method so that you can see error message
    @Override
    public void math() {
        System.out.println("8th grade");
    }
}
