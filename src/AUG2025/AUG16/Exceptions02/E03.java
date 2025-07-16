package AUG2025.AUG16.Exceptions02;

import java.util.Scanner;

public class E03 {

    /*

    throw keyword allows defining as much exception as coder wants.
    should be defined inside a method body.
    these new defined exceptions are objects.
    also it is possible to generate a message by using parameter part of exception declaration
     */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true){
        System.out.println("please enter your age");
        int age=input.nextInt();
        try {
            printAge(age);
            break;
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        }

    }

    public static  void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else if (age==0){
            throw new IllegalArgumentException("Age cant be 0");
        }else {
            System.out.println(age);
        }




    }

}
