package AUG2025.JUL11.Maps01;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<String, Integer > stdAges = new HashMap<>();
        stdAges.put("Ali",36);
        stdAges.put("Berkay",33);
        stdAges.put("Mehmet",26);
        stdAges.put("İrem",19);
        stdAges.put("Fatih",30);
        stdAges.put("Fatih",33);
        stdAges.put("Yusuf",35);

        //if multiple keys have same name then the last one is the value
        //this method can be used to overwrite a keys value
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=30, Serkant=26, Emin=19}

        //replace() method used for updating values by keys
        stdAges.replace("Fatih",19);
        System.out.println(stdAges);

        //replace(key,oldvalue,newvalue) method changes value if current value is old value
        stdAges.replace("Mehmet",26,23);
        System.out.println(stdAges);

        //putIfAbsent("Ali",30); method adds key-value pair there isnt any
        stdAges.putIfAbsent("Mustafa",30);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Emin=19, Ali=30}

        System.out.println(stdAges.get("Yusuf"));//33 null if there isnt any
        System.out.println(stdAges.getOrDefault("Yusuf", 0));//33


        System.out.println(stdAges.get("Fatih"));//null
        System.out.println(stdAges.getOrDefault("Fatih", 0));//gives 0 instead of null

        System.out.println(stdAges.containsValue(313));//false
        //returns true if specified value inside values

        System.out.println(stdAges.containsKey("Yusuf"));//true
        //returns true if specified key inside keys

        stdAges.remove("Mustafa");//remove the value of specified key
        System.out.println(stdAges);



        stdAges.remove("Yusuf",35);// removes both key and value if key-value pair is found in ap
        System.out.println(stdAges);

    }
}
