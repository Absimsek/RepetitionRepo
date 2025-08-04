package JUL2025.JUL11.Maps01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

        /*
        1) Maps has key-value pairs
        2) all keys are unique, but value can be same
        3) each element called as entry, all of them called an entryset
        4) it is called entryset because they are unique
        5) data types of key and value can be different
        7) HashMaps orders keys randomly due to that it is the fastest map type
         */

        HashMap<String, Integer> countryPopulation = new HashMap<>();//map initializng
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}
        // printing a map will print both keys and values together

        //get() method uses keys to bring values of keys
        int usaPopulation = countryPopulation.get("Turkey");
        System.out.println(usaPopulation);//83000000

        //printing all keys can be done with creating a set of keys and printing it
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        //printing all values can be done by store them in a collection and printing it
        Collection<Integer> value = countryPopulation.values();
        System.out.println(value);//[18000000, 400000000, 83000000, 83000000, 3000000]

        //Ornek : CountryPopulation mepindeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> values = countryPopulation.values();

        int sum = 0;
        for (Integer w : values) { //use for each to reach all values one by one and sum up
            sum = sum + w;
        }
        System.out.println(sum / values.size());//117400000


        //Loops cant be used with maps instead sets are used usually

        //entrySet() takes key-value pairs as one and make them a set
        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);//[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]






    }
}
