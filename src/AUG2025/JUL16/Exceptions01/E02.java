package AUG2025.JUL16.Exceptions01;

public class E02 {
    public static void main(String[] args) {

        String s = "1234";
        convertStringToInt(s);

        String t = "123a";
        convertStringToInt(t);


    }

    //If you try to convert a string that contains non-numeric characters to integer NumberFormatException occurs
    public static void convertStringToInt(String s){
       try{
           Integer intS = Integer.valueOf(s);
           System.out.println(intS + 1);
       }catch (NumberFormatException e){
           System.out.println("strings containing non-numeric characters cannot be converted");
           System.out.println(e.getMessage());
       }


    }

}
