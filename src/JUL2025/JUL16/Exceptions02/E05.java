package JUL2025.JUL16.Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {

    static void throwTest1()throws IOException{
        FileInputStream fis1 = new FileInputStream("src/JUL2025/JUL16/Exceptions02/throwTest1.txt");
        int k = 0;
        while ((k = fis1.read()) != -1) {
            System.out.print((char) k);
        }
        System.out.println("\n");
    }

    public static void main(String[] args)  {



      //throwTest1();// since method has throws keyword and not handled by call comp-time error occurs
        try {


            FileInputStream fis = new FileInputStream("src/JUL2025/JUL16/Exceptions02/file1.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage()+"filenotfound");

        } catch (IOException e) {
            System.err.println(e.getMessage()+"I/o");
        }

        /*
        1)   Both FileNotFoundException and IOException are Compile Time Exceptions.

        2)  FileNotFoundException looks for path and file existence.
            IOException is about input-output operations.

        3)  IOException class is parent of FileNotFoundException.
            Thus, IOException can be used instead of FileNotFoundException.

        4) If IOException and FileNotFoundException will be used together FileNotFoundException should be used first.(above)
         */

    }
}
