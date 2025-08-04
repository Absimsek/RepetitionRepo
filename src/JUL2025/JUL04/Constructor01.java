package JUL2025.JUL04;

public class Constructor01 {
    // constructors are code blocks which is responsible for creating the object of a class
    // constructors can be defined with parameters So that when creating object coder should add the parameters
    // if he wants to create that object
    // constructors are always inside the classes but default constructor is not visible
    // if user doesn't indicate any new constructor java will use default constructor and create object without using any parameters
    // constructor name should be the same with class name and all that is left are same as creating a method
    // also when creating constructor access modifier of constructor should be specified
    // constructors also used for accessing private elements inside its class
    // private data cannot be accessible from outside the class
    // a constructor with parameters which assigns those parameters to private data would work for access.
    private int secret01;
    private int secret02;
    private int secret03;
    private String str01;

    public Constructor01(int a, int b, int c){
        secret01=a;
        secret02=b;
        secret03=c;
    }

    public Constructor01(int a, int b, String s){
        secret01=a;
        secret02=b;
        str01=s;
    }

    public String toString(){
return "\n"+"secret01 ="+ secret01+"\nsecret02 ="+ secret02+ "\nsecret03 ="+ secret03+ "\nstr01 ="+ str01;
    }
}
