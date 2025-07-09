package AUG2025.AUG10;

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

}
