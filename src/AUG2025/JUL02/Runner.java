package AUG2025.JUL02;

import java.util.Locale;

public class Runner {
    public static void main(String[] args) {
        Wrapper01 w=new Wrapper01();
       // w.m.doubleValue();    //takes m value and converts to double by method because of wrapper
     //w.n;// takes n value but cannot apply any method because it is primitive .
        System.out.println("m : "+w.m.doubleValue()+" \nn : "+w.n);

        Concatenation01 c1=new Concatenation01();
        System.out.println(c1.a + c1.b+c1.apple);// (1+5)+ apple so makes outcome 6apple
        System.out.println(c1.a + c1.apple +c1.b);// (1 + apple) + 5 so makes outcome 1apple5
        System.out.println( c1.apple +c1.a +c1.b);// (apple + 1) + 5 so makes outcome apple15
        System.out.println( c1.apple +c1.a *c1.b);// apple + 1 * 5 so makes outcome apple5 presence changes
        //if all same operation then presence is from left to right so that's why first three example outcomes different
        System.out.println("\nnext\n");
        StringManipulation01 s1=new StringManipulation01();
        System.out.println(s1.s.toLowerCase(Locale.ROOT));//prints lowered string
        System.out.println(s1.s.toUpperCase(Locale.ROOT));//prints uppered string
        System.out.println(s1.s.contains("bored"));// prints true or false due to bored word included in string or not
        System.out.println(s1.s.substring(3, 8));// starting from index 3 takes all indexes until 8. 8 not included
        System.out.println(s1.s.charAt(3));//prints the character at index 3
        System.out.println(s1.s.startsWith("b", 1));// looks for string after offset starts with specified character or not
        // you can combine methods and make it more complicated but also efficient
        System.out.println(s1.s.substring(3, 8).toUpperCase(Locale.ROOT));// prints the substring and also makes it upper
        System.out.println(s1.s.substring(0, 1).toUpperCase(Locale.ROOT));// just uppercases the specified character at index bc substring has only 1 character not a word
        System.out.println("\nnext\n");
        System.out.println(s1.r.endsWith("bored"));//checks şf string ends with bored or not
        System.out.println(s1.r.replace("am", "do"));// changes all am words to do word
        System.out.println(s1.r.replace("o", "xxx"));//changes all o characters into xxx
        System.out.println(s1.r.replace("bored", "excited"));// changes bored into excited

        System.out.println(s1.r.replaceAll("[A-Z]", "*"));//replaces all upper letters with *
        System.out.println(s1.r.replaceAll("[^A-Z]", "-"));// replaces apart from all upper letters with -
        System.out.println(s1.r.replaceAll("[a-zA-Z]", "/"));// replaces all letters with /
        System.out.println(s1.r.replaceAll("[aeiouAEIOU]", "9"));// replaces all vowels with 9

    }

}
