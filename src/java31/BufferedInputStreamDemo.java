package java31;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try {

            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("input.txt");

            // Creates a BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);

            byte[] data = new byte[input.available()];
            input.read(data);

            for(byte b : data) {
                System.out.print((char) b);
            }


            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}