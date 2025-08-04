package JUL2025.JUL21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Sivas");
        myList.add("Ankara");
        myList.add("Kirikkale");
        myList.add("Samsun");
        myList.add("Istanbul");
        myList.add("Sivas");


        List<String> newList = getElementsLengthMoreThanFiveWithUpperCase(myList);
        System.out.println(newList);
        List<String> newList2=getElementsLengthMoreThanFiveWithUpperCase2(myList);
        System.out.println(newList2);
        printElementsUniqueLowerCaseSortWithLength2(myList);



    }

    //example: take the element which has longer than 5 characters and print them with uppercase letter in a list

    public static List<String> getElementsLengthMoreThanFiveWithUpperCase(List<String> myList) {
        System.out.println( "\n1st example: \n");
        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(t -> t.toUpperCase()).//map method is to set the updates
                collect(Collectors.toList());// collect method writes taken elements into target destination
    }
    //Recommended way
    public static List<String> getElementsLengthMoreThanFiveWithUpperCase2(List<String> myList) {
        System.out.println("\n2nd example: \n");
        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(String::toUpperCase).//instead of giving it some conditions we can use existing libraries methods as reference
                collect(Collectors.toList());
    }


    public static void printElementsUniqueLowerCaseSortWithLength2(List<String> myList){
        System.out.println("\n3rd example : \n");

        myList.
                stream().
                distinct().
                map(String::toLowerCase).//
                sorted(Comparator.comparing(String::length)).// compares length of each element and sortes them
                forEach(Utils::printInTheSameLineWithSpace);// use the specified method from utils class
    }

}
