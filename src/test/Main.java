package test;

import java.io.PrintStream;

class Main {
    public static void main(String[] args) {

        String data = "This is a text insidfdfde the file.";

        try {
            PrintStream output = new PrintStream("output.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}