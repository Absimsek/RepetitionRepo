package AUG2025.AUG11.maps02;

import java.util.Hashtable;

public class Hashtable01 {

    /*
   HashMap vs Hashtable
        1) HashMap is not thread-safe and synchronized degildir,
        but Hashtable is thread-safe and synchronized.
        2) HashMap allows  one null key and countless null values
           Hashtable doesnt allow any null for both key-value
        3) HashMap is fast, hashtable is slower


     */

    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges = new Hashtable<>();
        stdAges.put("Mustafa",41);
        stdAges.put("Seda",30);
        stdAges.put("Ekim",22);
        stdAges.put("Ali Can",18);
       // stdAges.put(null,15); // doesnt allowed
       // stdAges.put("mehmet",null); // doesnt allowed
        System.out.println(stdAges);//{Ekim=22, Ali Can=18, Mustafa=41, Seda=30}








    }


}
