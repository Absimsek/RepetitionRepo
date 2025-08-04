package AUG2025.JUL03;

import java.util.Scanner;

public class Runner02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
StringManipulation02 s1=new StringManipulation02();
        System.out.println(s1.s1.trim());//erases spaces apart from the ones between words
        System.out.println(s1.s1.trim().split(" ")[1].charAt(0));// splits by space and gives first character of 2nd word
        System.out.println(s1.s2.trim().split("a")[2]);// splits from second a but only takes the next word

        System.out.println(s1.i1.indexOf("js"));// finds the first appearance of js word gives index of it
        System.out.println(s1.i1.indexOf("python"));// if there is no such a word in string returns -1

        System.out.println(s1.i1.lastIndexOf("j"));// finds the last appearance of specific word or char
        System.out.println(s1.i1.indexOf("python"));// if there is no such a word in string returns -1
    }
}
