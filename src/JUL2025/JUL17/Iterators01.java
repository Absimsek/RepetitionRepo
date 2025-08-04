package JUL2025.JUL17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        /*
        1)Iterators does the same job as loops
        2)Infinite loops doesnt exist  in Iterators
        3)Iterators are used more for adding, deleting, element changing in collection

        there are 2 types of Iterators:
        1-Iterator: only have deleting function nothing more
        2-ListIterator: can do delete - sum - exchange.

        Iterators works one way from left to right
        ListIterators works for both way.

         */


        List<String> myList = new ArrayList<>();
        myList.add("E1");
        myList.add("E2");
        myList.add("E3");
        myList.add("E4");
        myList.add("E5");
        System.out.println(myList);


        Iterator<String> myItr = myList.iterator();

        //how to delete with iterator

        while (myItr.hasNext()) {//hasNext() ask for if there is any other character right after.
            //if so returns true , if not returns false
            String el = myItr.next();   //next(); pointer goes next element.
            if (el.equals("E2")) {
                myItr.remove();
            }
        }
        System.out.println(myList);

        //ListIterator usage
        List<String> yourList = new ArrayList<>();
        yourList.add("E1");
        yourList.add("E2");
        yourList.add("E3");
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) {
            String el = yourListItr.next();
            yourListItr.set(el + " - ");//set() method used for updating list
        }
        System.out.println(yourList);



        List<String> list3 = new ArrayList<>();
        list3.add("E1");
        list3.add("E2");
        list3.add("E3");
        System.out.println(list3);

        ListIterator<String> listItr=  list3.listIterator();


        while (listItr.hasNext()){
            listItr.next();
        }

        while (listItr.hasPrevious()){
           String el = listItr.previous();
           if (!listItr.hasPrevious()){
               System.out.println(el);
               break;
           }
            System.out.print(el+" <== ");

        }




    }
}
