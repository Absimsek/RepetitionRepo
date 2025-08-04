package AUG2025.JUL11.Maps01;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {
        //Example 1: write the code that gives how many times the word appeared in sentence
        //"I like you, like like!"  => I=1, like=3, you=1

        String s = "I like you, like like!";
        //first we should delete all punctions
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//I like you like like

        //seperate words by split method and store them in an array
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

      //initialize map with string,integer key value
        HashMap<String, Integer> occ = new HashMap<>();

        for (String w : words) {// iterate through each element of array
            Integer numOffOccurance = occ.get(w);// if the word doesnt added this will tell us
            //and if already exist than it will be incremented by 1

            if(numOffOccurance==null){
                occ.put(w,1);// since word wasnt in map yet now we add it next time it sees occ wil increase

            }else{
                occ.replace(w,numOffOccurance+1);// number of occurrence is updated
            }
        }
        System.out.println(occ);//{like=3, I=1, you=1}

    }
}
