package AUG2025.AUG16.Exceptions02;

public class E02 {
    public static void main(String[] args) {

        //ClassCastException occurs when you try to convert data types that can't be convertible to other data type
        // String to Object , Object to String
        Object obj = 70;

        try {
            String str = (String) obj;
            System.out.println(str);

        } catch (ClassCastException e) {
            System.err.println("this conversion is not allowed");
        }

    }
}
