package AUG2025.AUG8.AObjectCreation;


import java.util.Scanner;

public class ObjectCreation {
    //Assume that you want to use some method in which u already did in another classs
    //to use it you have 2 methods available
    //1st you can declare it static and arrive the method by class reference
    //2nd you use inheritance so that you should create objects of a class

    // how to create an object?
    // to create an object yıu should use class name and give object a name
    // an object is an instance of class so assume there is a int k value in class
    // int k will be created separately each object created so they all have unique instances

    public static void main(String[] args) {
        Class1 o1=new Class1();// creates o1 object
        Class1 o2=new Class1();// creates o2 object
        Class2 o3=new Class2();//creates o3 object
        Class2 o4=new Class2();//creates o4 object

        // class 1 have int a value but not assigned, class2 has int k also not assigned



        Scanner input = new Scanner(System.in);
        System.out.println("object 1 "+o1.a);
        System.out.println("object 2 "+o2.a);
        System.out.println("object 3 "+o3.k);
        System.out.println("object 4 "+o4.k);
      // all objects has the default value as seen so now lets change values specifically for objects
        int number;
        System.out.println("please enter a number");
        number=input.nextInt();
        o1.a=number;

        System.out.println("please enter a number");
        number=input.nextInt();
        o2.a=number;

        System.out.println("please enter a number");
        number=input.nextInt();
        o3.k=number;

        System.out.println("please enter a number");
        number=input.nextInt();
        o4.k=number;

        System.out.println("object 1 "+o1.a);
        System.out.println("object 2 "+o2.a);
        System.out.println("object 3 "+o3.k);
        System.out.println("object 4 "+o4.k);

        // now all the objects has values which are given by user even objects are from same class their value can be differentiate
    }
}
