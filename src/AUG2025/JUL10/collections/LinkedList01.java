package AUG2025.JUL10.collections;

import java.util.LinkedList;

public class LinkedList01 {
    // until here for data sets we used arrays and arraylists
    // Arrays are fast for search but static memory size so no adding or deleting more than max is possible
    //Bıg-O-Notation --> accessing element O(1), insert/delete O(n)

    // Arraylists are also fast for search,fixed size and also can perform add/delete, but it consumes too much memory
    //Bıg-O-Notation --> accessing element O(1), insert/delete O(n) for middle,and O(1) for end
    // because arraylist add function adds data to end

    // so Arraylists are not exact structure to use when deletion/insertion will be making a lot.
    // LinkedLists are poor by access but good for insert/delete based operations and are dynamic sized
    //Bıg-O-Notation --> accessing element O(n) due to need of traverse one by one each element,
    // insert/delete O(1) with node reference

    //so where to use is like that now
    //                      ARRAY                       ARRAYLIST                       LINKEDLIST

    // NEED TO         fast access data              fast access data             frequently use add/delete

    // SIZE           static non-changeable             dynamic-fixed                  dynamic-fixed




    public static void main(String[] args) {
    LinkedList<String> l1=new LinkedList<>();// LinkedList creation
        l1.add("istanbul");
        l1.add("Ankara");
        l1.add("Kırıkkale");
        l1.add("Sivas");
        l1.add("Samsun");
        System.out.println(l1);

        System.out.println(l1.remove(3));// remove by index
        System.out.println(l1.remove());// removes index 0 so head node
        System.out.println(l1.remove("kırıkkale"));//removes specified string

        // if there are more than 1 same strings than removeFirstOccurrence or lastOccurrence would work to specify which one to remove
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");

        System.out.println(l1);
        // to return the head node of linkedlist use peek()
        System.out.println(l1.peek());
        System.out.println(l1);
        // to both return and remove head node use poll()
        System.out.println(l1.poll());
        System.out.println(l1);

        //element() is same as peek but when list empty error occurs
        //pop() is same as poll but when list empty error occurs


    }

}
