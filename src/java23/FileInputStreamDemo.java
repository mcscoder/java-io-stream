package java23;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String args[]) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            // Initialize an array with a specific size
            byte[] data = new byte[input.available()];

            // Storing data to the array that has just been created
            input.read(data);

            System.out.println("Data in the file: ");
            
            for(byte b : data) {
                System.out.print((char) b);
            }
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
