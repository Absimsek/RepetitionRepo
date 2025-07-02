package Temmuz2025.t1;
import java.util.Scanner;
public class Scanner01 {

    public static void main(String[] args) {
    //when you need input use scanner the format is as follows
    Scanner input = new Scanner(System.in); // the name is assigned as input here but could differentiate
 int a;String ali;double b; byte x;
        System.out.println("enter the byte");
        x=input.nextByte();
        System.out.println("enter the integer");
        a= input.nextInt();
        System.out.println("enter the double");
        b= input.nextDouble();//input for double needs to be used with , not .
        System.out.println("enter the string");
        ali= input.next();

        System.out.println("byte,int,doub,str as follows");
        System.out.println(x+","+a+","+b+","+ali);





    }
}