package java41;

import java.io.Reader;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {

        // Creates an array of character
        char[] array = new char[100];

        try {
            // Creates a reader using the FileReader
            Reader input = new FileReader("input.txt");

            // Checks if reader is ready
            System.out.println("Is there data in the stream?  " + input.ready());

            // Reads characters
            // input.read(array);
            System.out.println("Data in the stream:");
            // System.out.println(array);

            int k;
            while ((k = input.read()) != -1) {
                System.out.print((char) k);
            }

            // Closes the reader
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
