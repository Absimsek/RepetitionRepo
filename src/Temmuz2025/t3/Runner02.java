package Temmuz2025.t3;

import java.util.Scanner;

public class Runner02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
StringManipulation02 s1=new StringManipulation02();
        System.out.println(s1.s1.trim());//erases spaces apart from the ones between words
        System.out.println(s1.s1.trim().split(" ")[1].charAt(0));// splits by space and gives first character of 2nd word
        System.out.println(s1.s2.trim().split("a")[2]);// splits from second a but only takes the next word
    }
}
