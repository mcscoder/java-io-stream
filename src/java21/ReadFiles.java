package java21;

import java.io.FileReader;

public class ReadFiles {
    public static void main(String[] args) {

        char[] array = new char[100];
        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("src/java21/input.txt");

            // Reads characters
            input.read(array);
            System.out.println("Data in the file:");
            System.out.println(array);

            // Closes the reader
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
