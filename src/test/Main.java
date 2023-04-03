package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            
            FilterInputStream filter = new BufferedInputStream(new FileInputStream("input.txt"));

            byte[] data = new byte[filter.available()];
            filter.read(data);

            for(byte b : data) {
                System.out.print((char) b);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}