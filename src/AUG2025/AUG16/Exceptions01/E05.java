package AUG2025.AUG16.Exceptions01;

public class E05 {
    public static void main(String[] args) {

        int a = 12;
        int b = 1;
        String s = "Java";
        getCharFromString(s,a,b);//a

    }

    public static void getCharFromString(String s, int a, int b) {

        try {//to control 2 or more exceptions with one try block we can use multiple catch blocks one after another
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e)    {
            System.out.println("Index out of bounds");
        }

    }


}














