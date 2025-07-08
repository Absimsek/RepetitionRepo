package AUG2025.AUG4;

import java.util.Scanner;

public class Runner01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        Constructor01 c1=new Constructor01(10,20,30);// object created and private values assigned by constructor
        // when we use c1. normally accessible methods and variables are showing up
        // but private ones are not showing up because they are not accessible
        // so we use parametered constructors to access private values and assign them as we want

        Constructor01 c2 = new Constructor01(40,50,"xd");
        //this parametered constructor assigns 2 integers 1 string not 3 integers unlike other one
        // so by parameters given we can change constructor and object that will be created

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(StaticKeyword.staticStr);// we accessed static member through class reference
        // and didn't create any object

        //StaticKeyword.str;// gives error bc it is not static and cannot accessible
        // so to access it we need instance of class
        StaticKeyword s1=new StaticKeyword();
        System.out.println(s1.str);// now we can reach it through object reference
    }

}
