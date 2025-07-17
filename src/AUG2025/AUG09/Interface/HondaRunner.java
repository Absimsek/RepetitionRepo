package AUG2025.AUG09.Interface;

public class HondaRunner {

    public static void main(String[] args) {

    Civic myCivic =new Civic();
    myCivic.cool();
    myCivic.run();
    myCivic.eco();// accessed interface default method through child class object

    Engine.stop();// accessed interface static method through name

        Accord myAccord=new Accord();
        myAccord.cool();
        myAccord.run();

        System.out.println("Ac.price = " + Ac.price);//interface variables are static can be accessible through name
        System.out.println("Engine.price = " + Engine.price);
        System.out.println("Security.price = " + Security.price);
    }
}
