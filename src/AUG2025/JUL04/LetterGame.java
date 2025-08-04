package AUG2025.JUL04;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterGame {
    public static void main(String[] args) {
        //create a game with list
        //user can enter numbers
        //if number is already in list, print found it!!!
        //if number not in list take lives-1 and add new number

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        int counter=0;
        int lives=5;

        int choseNumber;
        do {
            if (counter==lives){
                System.out.println("game over");
                break;
            }
            System.out.println("please enter a number");
            choseNumber=input.nextInt();
            if (list1.contains(choseNumber)){
                System.out.println("Found it!!!");
            }else
                list1.add(choseNumber);
            System.out.println(list1);
            counter++;
        }while(true);
    }
}
