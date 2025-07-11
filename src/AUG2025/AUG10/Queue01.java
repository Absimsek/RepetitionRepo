package AUG2025.AUG10;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    //Queue is a data structure where elements should obey rule FIFO
    //FIFO(first in first out) rule says whoever comes first will leave first
    // so lets say a queue has elements in order 5,6,4,3,2,7,8 since first come 5 than first leave 5
    // add methods add element to end of queue so that rule will work
    // delete method deletes from head so that new incomers can enter

    public static void main(String[] args) {

    Queue<String> depo = new LinkedList<>();
        depo.add("Egg");
        depo.add("Milk");
        depo.add("Cheese");
        depo.add("Meat");
        System.out.println(depo);//[Egg, Milk, Cheese, Meat]

        depo.remove();
        System.out.println(depo);//[Milk, Cheese, Meat]

        System.out.println(depo.peek());//Milk
        System.out.println(depo.poll());
        System.out.println(depo);//[Cheese, Meat]
        System.out.println(depo.element());//Cheese

        depo.clear();
        System.out.println(depo.poll());//null
    // System.out.println(depo.remove());//exception
    //  System.out.println(depo.element());//exception
        System.out.println(depo.peek());//null
    }
}
