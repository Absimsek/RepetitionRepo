package JUL2025.JUL16.Exceptions01;

public class E01 {
    /*

    Exceptions are problems that are unexpected. When there is a problem that compiler cannot resolve exceptions are used.
    Exceptions have related names with corresponding error, gives a message of why there is an exception and where it occurred.
    Exceptions stop execution. Needs to be cleared with try catch.

    Try Catch blocks are used for codes that possibly throw an exception.
    Code should be inside try block. If any exception occurs catch block will catch the exception and executes the itself body.
    If no exception occurs inside try block catch block will never execute.

    Another way is just handling the exception, thus reorganize the code.

    Instead of handling each error with if-else , try-catch helps coder to reuse same code without any additional effort.





     */
    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        divide(a, b);
        divide2(a, b);


    }

    //ArithmeticException occurs when there is an unexpected error about
    public static void divide2(int a, int b) {
        try {
            System.out.println("this is before exception ");
            System.out.println(a / b);
            System.out.println("this is after exception ");


        } catch (ArithmeticException e) {

            System.out.println("Do not divide by zero ");

        }


    }


    //not recommended use of exception handling with if blocks
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        }
    }


}
