package java24;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        String data = "Son dep trai";
        try {
            out = new FileOutputStream(" flush.txt");

            // Using write() method
            out.write(data.getBytes());

            // Using the flush() method
            // out.flush();
            // out.close();
            Thread.sleep(10000);
            
            
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
