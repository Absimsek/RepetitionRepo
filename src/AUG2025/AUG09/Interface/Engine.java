package AUG2025.AUG09.Interface;

public interface Engine {

    void run();
    int price =3000;

    default void eco(){
        System.out.println("Uses gas less");
    }// will be accessed by child's object

    static void stop(){
        System.out.println("Stops securely");
    }// will be accessed by interface name
}
