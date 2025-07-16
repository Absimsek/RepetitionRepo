package AUG2025.AUG16.Exceptions01;

public class E04 {
    public static void main(String[] args) {

        String arr[] = {"J", "A", "V", "A"};
        getElementFromArray(arr,1);//A
        getElementFromArray(arr,5);//


    }

    //when an index that doesn't exist in an array is called, ArrayIndexOutOfBoundsException occurs.
    public static void getElementFromArray(String[] s, int idx) {

        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//Index 5 out of bounds for length 4
            System.out.println(e.getCause());//null
        }

    }


}
