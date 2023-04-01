package bytearrayoutputstream;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamDemo2 {
    public static void main(String[] args) {
        String data = "This is data.";

        try {
            // Creates an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            out.close();

            byte[] array = data.getBytes();

            // Writes data to the output stream
            out.write(array);

            // Returns an array of bytes
            byte[] byteData = out.toByteArray();
            System.out.print("Data using toByteArray(): ");
            for (int i = 0; i < byteData.length; i++) {
                System.out.print((char) byteData[i]);
            }

            // Returns a string
            String stringData = out.toString();
            System.out.println("\nData using toString(): " + stringData);
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
