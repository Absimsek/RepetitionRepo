package JUL2025.JUL21;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ankara");
        myList.add("Sivas");
        myList.add("Istanbul");
        myList.add("Samsun");
        myList.add("Kırıkkale");
        myList.add("Kırıkkale");

        removeIfLengthGreaterThanFive(myList);

        myList.add("Ankara");
        myList.add("Sivas");
        myList.add("Istanbul");
        myList.add("Samsun");
        myList.add("Kırıkkale");
        myList.add("Kırıkkale");// since remove method removed most of elements we need to add more due to tryout other methods

        removeIfElementsStartsWithZorEndsWithf(myList);

        myList.add("Sivas");
        myList.add("Samsun");
        myList.add("Kırıkkale");

        removeIfElementsStartsWithZorEndsWithf2(myList);
    }
    //1) create a method that removes elements which has more than 5 characters
    public static void removeIfLengthGreaterThanFive( List<String> myList){
        myList.removeIf(t->t.length()>5);
        System.out.println(myList);
    }


    //2 ) create a method that removes elements which starts with S or ends with e
    //1st way
    public static void removeIfElementsStartsWithZorEndsWithf(List<String> myList){
        myList.removeIf(t->t.charAt(0)=='S' || t.charAt(t.length()-1)=='e' );
        System.out.println(myList);
    }
    //2nd way
    public static void removeIfElementsStartsWithZorEndsWithf2(List<String> myList){
        myList.removeIf(t->t.startsWith("S") || t.endsWith("e"));//be careful it is case-sensitive
        System.out.println(myList);
    }










}
