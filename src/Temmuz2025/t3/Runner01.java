package Temmuz2025.t3;

import java.util.Scanner;

public class Runner01 {
    public static void main(String[] args) {

    SwapValues s1=new SwapValues();
        System.out.println("a = " + s1.a);
        System.out.println("b = " + s1.b);
        s1.temp=s1.a;// value of a transferred empty data
        s1.a=s1.b;// value of b is now value of a
        s1.b=s1.temp;// value of temp is now value of a
        //since value of a was transferred to temp first and than to b now value of b is value of a
        System.out.println("\nvalues are changed\n");

        System.out.println("a = " + s1.a);
        System.out.println("b = " + s1.b);

        System.out.println("\nnext\n");
        //we will do some basic math to solve it
        System.out.println("x = "+s1.x);
        System.out.println("y = "+s1.y);
        System.out.println("\nvalues are changed\n");
        s1.x=s1.x+s1.y;// y added to x
        s1.y=s1.x- s1.y;//x-y assigned to y and will be equal to  first x due to x already be x+y
        s1.x=s1.x-s1.y;// x-y assigned to x and will be equal to first y  due to x already be x+y and y already be x
        System.out.println("x = " + s1.x);
        System.out.println("y = " + s1.y);
        System.out.println("\nnext\n");

        StringManipulation01 s2=new StringManipulation01();
        System.out.println(s2.s.replaceAll("[^ ]", "---"));// apart from spaces all characters changes into ---


        // Example: Control the password which entered by user by the rules as follows:
        // 1- at least 8 characters
        // 2- no space character
        // 3- at least 1 uppercase letter
        // 4- at leats 1 lowercase letter
        // 5- at leats 1 digit
        // 6- at leats 1 special character
        Scanner input= new Scanner(System.in);
        boolean pwd= false;
        while(!pwd){
        System.out.println("\nplease enter your password\n");
        s2.password=input.nextLine();
        boolean r1 = s2.password.length()>=8;
        System.out.println("1- at least 8 characters\n"+r1);
        boolean r2 = s2.password.contains(" ");
        System.out.println("2- no space character\n"+!r2);
        boolean r3 = s2.password.replaceAll("[^A-Z]","").length()>0;
        System.out.println("3- at least 1 uppercase letter\n"+r3);
        boolean r4 = s2.password.replaceAll("[^a-z]","").length()>0;
        System.out.println("4- at leats 1 lowercase letter\n"+r4);
        boolean r5 = s2.password.replaceAll("[\\D]","").length()>0;
        System.out.println("5- at leats 1 digit\n"+r5);
        boolean r6 = s2.password.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println("6- at leats 1 special character\n"+r6);


          pwd=  r1&&!r2&&r3&&r4&&r5&&r6;
        if (pwd){
            System.out.println("password accepted");
        }else
            System.out.println("\npassword incorrect try again");

        }

    }

}
