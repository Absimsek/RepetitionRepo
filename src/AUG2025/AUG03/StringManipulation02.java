package AUG2025.AUG03;

public class StringManipulation02 {
    //trim() method erases the space characters at the beginning and the end of String if there is any
    //trim() method doesn't do anything to space character between string
    //split() method separates the String by the character specified
    //split() method also needs order number after character has been specified so that it can reach the duplications
    //to separate from the second "a" character in the string use split("a")[2]

    String s1 = "   there are 8 spaces in this sentence ";
    String s2= "    a1 a2 a3 a4 ";

    //indexOf() method is used for finding the first appearance(index) of a specific word or character
    //lastIndexOf() method used for finding the last  appearance of a specific word or char
    String i1="java css js";


                                            //MEMORY TYPES
        //STACK MEMORY
    //small memory
    //addresses are held here.(Both primitive and non primitives)


        //HEAP MEMORY
    //big memory
    //includes non-primitives addresses created here but stored at stack memory


    //equals() method is used to compare two data and gives true if they are equal
    // but not looks for its address so only looks for strings
    // when we need to look for both value and address we sue == sign
    //equalsIgnoreCase() method is used to compare 2 string but not key sensitive
}
