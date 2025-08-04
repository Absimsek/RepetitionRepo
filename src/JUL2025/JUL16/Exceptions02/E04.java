package JUL2025.JUL16.Exceptions02;

import java.io.FileInputStream;
import java.io.IOException;

public class E04 {
    /*
    1) The exceptions that occurs in console when code is executed are called Runtime Exceptions.
    They are also called as Unchecked Exceptions


    2) When writing codes sometimes red underline occurs indicating that there is an error which will prevent to execution.
    those exceptions are called Compile Time Exceptions which can also called as Checked Exceptions.


      Throws keyword is used right after method parenthesis, thus before body
      Throws keyword indicates that the exception given can occur in the method
      When someone called a method that has throws keyword, they should handle the exception stated in throws.
     */


    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/JUL2025/JUL16/Exceptions02/file.txt");

        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }

    }
}
