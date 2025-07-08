package AUG2025.AUG4;

import java.util.ArrayList;

public class ArrayList01 {
    // We use arrays to store the datas which have the same data type
    // but arrays are not dynamic they are static so we cant add or delete elements from it
    // to solve this we can use arraylists instead which is dynamic so fixed size.
    // array lists elements are changeable we can add/delete as much as we want
    // with this improvement arraylist lose some features
    // they are slower than arrays, and consuming more storage than arrays
    // due to they have lots of space for add/ delete
    // Arraylists stores non-primitive data types. So Objects, Wrapper classes, Strings can be storable here


    public static void main(String[] args) {


        ArrayList<Integer> ages= new ArrayList<>();// creation of an array list
        System.out.println(ages);// prints the empty list

        //add() method is used for adding new elements to the list
        ages.add(10);
        ages.add(30);
        ages.add(20);
        // datas added to list by order first to add will be added first
        ages.add(1,50);// adding specific position by index number

        // if we need to add multiple elements we should create another list for those
        // than add the second list to first one
        ArrayList<Integer> ages2=new ArrayList<>();
        ages2.add(90);
        ages2.add(80);
        ages2.add(70);

        ages.addAll(ages2);// all the 2nd list is added to 1st list
        System.out.println(ages);//prints list

        ages.addAll(2,ages2);// adding new list to specific index
        System.out.println(ages);

        System.out.println(ages.size());//prints size of list
        System.out.println(ages.get(2));// to reach the element at 2nd index
        //charAt method is not applicable on arraylists
        ages.set(2, 800);// changes the value of element at index 2
        System.out.println(ages);//as seen 2nd index changed as 800

        ages2.clear();// deletes all elements inside the list
        System.out.println(ages.contains(800));// looks for specific element in arraylist

        System.out.println(ages2.isEmpty());// controls if list is empty or not


    }
}
