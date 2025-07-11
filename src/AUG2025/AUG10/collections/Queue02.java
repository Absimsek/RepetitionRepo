package AUG2025.AUG10.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {

    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();//sorts the first element as alphabetical order use poll to see natural order of queue
        line.add("Egg");
        line.add("Milk");
        line.add("Cheese");
        line.add("Meat");


        System.out.println(line);//[Cheese, Meat, Egg, Milk]




        /*
        As seen queues can be created by 2 ways, 1 using linkedlists and other is using priorityqueues
        object of queues cannot be created by it is reference, means no QUEUE word after new word
        queues are interfaces thats why object of it cannot be created
         */


        Deque<String> d = new LinkedList<>();
        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");
        System.out.println(d);//[Egg, Milk, Cheese, Meat]












    }
}
