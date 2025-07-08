package AUG2025.AUG4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {
    public static void main(String[] args) {
    ArrayList<Integer> ages= new ArrayList<>();
        ages.add(10);
        ages.add(30);
        ages.add(20);
        ages.add(40);
        ages.add(10);

    ArrayList<Integer> ages2=new ArrayList<>();
        ages2.add(10);
        ages2.add(20);
        ages2.add(40);
        ages2.add(30);
        ages2.add(10);
    //to make 2 list equal all elements that share same indexes should be same
        // sort() method can sort the numbers inside list

        Collections.sort(ages);
        Collections.sort(ages2);

        boolean isEqual= ages.equals(ages2);// looks if 2 lists are same
        System.out.println(isEqual);

        //remove() method deletes the first appearance of a String data or removes the index specified
        ArrayList<String> str1=new ArrayList<>();
        str1.add("istanbul");
        str1.add("kirikkale");
        str1.add("istanbul");
        str1.add("ankara");
        str1.add("kirikkale");


        System.out.println(str1);
        System.out.println(str1.remove(1));//deletes the element at index1 // and returns the element removed
        System.out.println(str1);
        System.out.println(str1.remove("istanbul"));//deletes first appearance of istanbul // and returns true or false
        System.out.println(str1);
        str1.remove("ankara");//deletes first appearance of ankara
        System.out.println(str1);


    }
}
