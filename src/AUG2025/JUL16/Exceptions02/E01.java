package AUG2025.JUL16.Exceptions02;

public class E01 {
    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s);//4

        String t = "";
        getNumberOfChars(t);//0


        String u = null;
        getNumberOfChars(u);//NullPointerException


    }

    //null value cannot be used by some methods, NullPointerException occurs

    public static void getNumberOfChars(String s) {
        try{
            int numOfChars = s.length();
            System.out.println(numOfChars);
        }catch (NullPointerException e){
            System.out.println("null value cannot be used for the methods chosen ");
        }

    }


}
