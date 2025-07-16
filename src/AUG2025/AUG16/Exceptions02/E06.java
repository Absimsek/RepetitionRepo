package AUG2025.AUG16.Exceptions02;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        /*
        1) finally block is for executing data whether there is an exception occurred or not
        2) try block can't be used alone;
        try-catch, try-(multiple catch), try-finally, try-catch-finally, try-(multiple catch)-finally
        those above are possible ways to use try block.

        4) there are problems that cannot be handled called errors
        Memory errors consist of 2 elements:
        1-if stack memory is full "StackOverFlow error" occurs
        2-if heap memory is full "OutOfMemory error" occurs

         */

        int a ;
        int b ;
        int c[] = {3, 6, 9, 12};
        int breaker;
        Scanner input=new Scanner(System.in);
        while(true){
            try{
            System.out.println("\nplease enter the first value");
            a=input.nextInt();
            System.out.println("\nplease enter the second value");
            b=input.nextInt();
            getElementFromArray(c,a,b);
            System.out.println("\nwould you like to quit? press 0 if so");
            breaker=input.nextInt();
            if (breaker==0){

                break;
            }


            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }

        }

    }

    public static void getElementFromArray(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch ( ArithmeticException e) {
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("\nConnection has ben cut with database");

        }


    }


}
