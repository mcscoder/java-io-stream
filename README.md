# Java I/O Stream

## Java I/O Stream

<details><summary>Java I/O Stream</summary>

- In Java, streams are the sequence of data that are read from the source and written to the destination.

- An input stream is used to read data from the source. And, an output stream is used to write data to the destination.

#### Example:
- In the above example, we have used `System.out` to print a string. Here, the `System.out` is a type of output stream.

- Similarity, there are input streams used to take input, such as `System.in` which are often combined with the `Scanner` class.

<img src="assets/1.0-java-io-stream/1.png">

Credit: Programiz

</details>

<details><summary>Types of stream</summary>

#### Depending upon the data a stream holds, it can be classified into:
- Byte Stream
- Character Stream

</details>

<details><summary>Byte Stream</summary>

- Byte stream is used to read data and write a single byte (8 bits) of data.

- All byte stream classes are derived from base abstract classes called `InputStream` and `OutputStream`.

</details>

<details><summary>Character Stream</summary>

- Character stream is used to read and write a single character of data.

- All the character stream classes are derived from base abstract classes `Reader` and `Writer`.

</details>

## 1.1. Java InputStream Class

<details><summary>Java InputStream Class</summary>

- The `InputStream` class of the `java.io` package is an abstract superclass that represents an input stream of bytes.

- Since `InputStream` is an abstract class, it is not useful by itself. However, its subclasses can be used to read data.

</details>

<details><summary>Subclasses of InputStream</summary>

- In oder to use the functionality of `InputStream`, we can use its subclasses. Some of them are:

    - `FileInputStream`

    - `ByteArrayInputStream`

    - `ObjectInputStream`

<img src="assets/1.1-java-inputstream-class/1.png">

Credit: Programiz

</details>

<details><summary>Create an InputStream</summary>

- In oder to create an InputStream, we must import the `java.io.InputStream` package first.

#### Syntax:

```java
// Create an InputStream
InputStream obj = new FileInputStream();
```

- Here, we have created an input stream using `FileInputStream`.

- `InputStream` is an abstract class, hence we cannot create an object of `InputStream`.

</details>

<details><summary>Methods of InputStream</summary>

- The `InputStream` class provides different methods that are implemented by its subclasses. 

#### Commonly used methods:

1. `read()` - Reads one byte of data from the input stream.

2. `read(byte[] array)` - Reads bytes from the stream and stores in the specified array.

3. `available()` - Returns the number of bytes available in the input stream.

4. `mark()` - Marks the position in the input stream up to which data has been read.

5. `reset()` - Return the control to the point in the stream where mark was set.

6. `markSupported` - Checks if the `mark()` and `set()` method is supported in the stream.

7. `skips()` - Skips and discards the specified number of bytes from the input stream.

8. `close()` - Closes the input stream.

</details>

## 1.2. Java OutputStream Class

<details><summary>Java OutputStream class</summary>

- The `OutputStream` class of the `java.io` package is an abstract superclass that represents an output stream of bytes.

- Since `OutputStream` is an abstract class, it is not useful by itself. However, its subclasses can be used to write data.

</details>

<details><summary>Subclasses of OutputStream</summary>

- In oder to use the functionality of `OutputStream`, we can use its subclasses. Some of them are:

    - `FileOutputStream`

    - `ByteArrayOutputStream`

    - `ObjectOutputStream`

<img src="assets/1.2-java-outputstream-class/1.png">

Credit: Programiz

</details>

<details><summary>Create an OutputStream</summary>

- In oder to create an `OutputStream`, we must import `java.io.OutputStream` package first.

#### Syntax:

```java
// Create an OutputStream
OutputStream obj = new FileOutputStream();
```

- Here, we have created an object of output stream using `FileOutputStream`. It is.

- `OutputStream` is an abstract class, hence we cannot create an object of `OutputStream`.

</details>

<details><summary>Methods of OutputStream</summary>

- The `OutputStream` class provides different methods that are implemented by its subclasses.

#### Commonly used methods:

1. `write()` - Writes the specified byte to the output stream.

2. `write(byte[] array)` - Writes the bytes from the specified array to the output stream.

3. `flush()` - Forces to write all data present in output stream to the destination.

4. `close()` - Closes the output stream.

</details>

## 1.3. Java ByteArrayOutputStream Class

<details><summary>Java ByteArrayOutputStream Class</summary>

- The `ByteArrayOutputStream` class of the `java.io` package can be used to write an array of output data (in bytes).

- It extends the `OutputStream` abstract class.

<img src="assets/1.3-java-bytearrayoutputstream-class/1.png">

Credit: Programiz

#### Note: In `ByteArrayOutputStream` maintains an internal array of bytes to store the data.

</details>

<details><summary>Create a ByteArrayOutputStream</summary>

- In oder to create a byte array output stream, we must import the `java.io.ByteOutputStream` package first.

#### Syntax:

```java
// Creates a ByteArrayOutputStream with default size
ByteArrayOutputStream out = new ByteArrayOutputStream();
```

- Here, we have created an output stream that will write data to an array of bytes with default size 32 bytes.

- We can change the default size of the array.

#### Syntax:

```java
// Creating a ByteArrayOutputStream with specified size
ByteArrayOutputStream out = new ByteArrayOutputStream(int size);
```

- Here, the `size` specifies the length of the array.

</details>

<details><summary>Methods of ByteArrayStreamOutput</summary>

#### write() method:

| Methods | Description |
| --- | --- |
| `write(int byte)` | Writes specified byte to the output stream. |
| `write(byte[] array)` | Writes the bytes from the specified array to the output stream. |
| `write(byte[] arr, int start, int length)` | Writes the number of bytes equal to length to the output stream from an array starting from the position start. |
| `writeTo(ByteArrayOutputStream out1)` | Writes the entire data of the current output stream to the specified output stream. |

#### Example: ByteArrayOutputStream to write data

```java
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamDemo1 {
    public static void main(String[] args) {

        String data = "This is a line of text inside the string.";

        try {
            // Create an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data.getBytes();

            // Write data to the output stream
            out.write(array);

            // Retrieve data from the output stream in string format
            String streamData = out.toString();
            System.out.println("Output stream: " + streamData);

            out.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
```

#### Output:

```
Output stream: This is a line of text inside the string.
```

- To write the data to the output stream, we have used the `write()` method.

#### Note: The `getByte()` method used in the program converts a string into an array of bytes.

</details>

<details><summary>Access Data from ByteArrayOutputStream</summary>

- `toByteArray()` - Returns the array present inside the output stream.

- `toString()` - Returns the entire data of the output stream in string form.

#### Example:

```java
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamDemo2 {
    public static void main(String[] args) {
        String data = "This is data.";

        try {
            // Creates an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
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

            out.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
```

#### Output:

```
Data using toByteArray(): This is data.
Data using toString(): This is data.
```

</details>

<details><summary>close() Method</summary>

- To close the output stream, we can use the `close()` method.

- However, the `close()` method has no effect in `ByteArrayOutputStream` class. We can use methods of this class even after the `close()` method is called.

#### Example:

```java
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamDemo2 {
    public static void main(String[] args) {
        String data = "This is data.";

        try {
            // Creates an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            // Invoking `close()` method
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
```

#### Output:

```
Data using toByteArray(): This is data.
Data using toString(): This is data.
```

- As you can see, `ByteArrayOutputStream` methods still run normally after invoking `close()` method.

</details>

<details><summary>Other Methods of ByteArrayOutputStream</summary>

| Methods | Description |
| --- | --- |
| size() | returns the size of the array in the output stream |
| flush() | clears the output stream |

- To learn more, visit [Java ByteArrayOutputStream (official Java Documentation)](https://docs.oracle.com/javase/7/docs/api/java/io/ByteArrayOutputStream.html).

</details>

## 2.1. Java File Class

<details><summary>Java File Class</summary>

- The `File` class of the `java.io` package is used to perform various operations on files and directories.

</details>

<details><summary>Create a Java File Object</summary>

- To create an object of `File`, we need to import the `java.io.File` package first.

#### Syntax:

```java
// create an object of File using the path
File file = new File(String pathName);
```

- Here we have created a File object named `file`. The object can be used to work with files and directories.

</details>

<details><summary>Java File Operations Methods</summary>

| Operation | Method | Package |
| --- | --- | --- |
| Create file | `createNewFile()` | `java.io.File` |
| Read file | `read()` | `java.io.FileReader` |
| Write file | `write()` | `java.io.FileWriter` |
| Delete file | `delete()` | `java.io.File` |

---

### Java create files

- To create a new file, we can use the `createNewFile()` method. It return:

    - `true` if a new file is created.
    - `false` if the file already exists in the specified location.

#### Example:

```java
// importing the File class
import java.io.File;

public class CreateFiles {
    public static void main(String[] args) {

        // create a file object for the current location
        File file = new File("newFile.txt");

        try {

            // trying to create a file based on the object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("The new file is created.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
```

---

### Java read files

- To read data from file, we can use subclasses of either `InputStream` or `Reader`.

#### Example: Read a file using FileReader

- Suppose we have a file named `input.txt` with the following content:
```
May co biet bo may ai la khong ha thang nhoc.
```

- Now let's try to read the files using Java `FileReader`.

```java
import java.io.FileReader;

public class ReadFiles {
    public static void main(String[] args) {

        char[] array = new char[100];
        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("input.txt");

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
```

#### Output:

```
Data in the file:
May co biet bo may ai la khong ha thang nhoc.
```

- In the above example, we have used created an object of `FileReader` named `input`. It is now linked with the `input.txt` file.

```java
FileReader input = new FileReader("input.txt");
```

- To read the data from the `input.txt` file, we have used the `read()` method of `FileReader`.

#### Note: `input.txt` is a file path which can be replaced by the file path you want to read. The file path can be a relative or system path.

---

### Java writes to files

- To write data to file, we can use subclasses of either `OutputStream` or `Writer`.

#### Example: Write to file using FileWriter

```java
// importing the FileWriter class
import java.io.FileWriter;

public class WritesToFiles {
    public static void main(String args[]) {

        String data = "This is the data in the output file";
        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("output.txt");

            // Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
```

#### Output:

```
Data is written to the file.
```

- In the above example, we have created a writer using the `FileWriter` class. The writer is linked with the `output.txt` file.

```java
FileWriter output = new FileWriter("output.txt");
```

- To write data to the file, we have used the `write()` method.

- When we run the program, the `output.txt` file is filled with the following content.

```
This is the data in the output file.
```

---

### Java delete files

- We can use the `delete()` method of the `File` class to delete the specified file or directory. It returns:

    - `true` if the file is deleted.
    - `false` if the file does not exist.

#### Note: We can only delete empty directories.

#### Example: Delete a file

```java
// Importing the File class
import java.io.File;

public class DeleteFiles {
    public static void main(String[] args) {

        // creates a file object
        File file = new File("file.txt");

        // deletes the file
        boolean value = file.delete();
        if (value) {
            System.out.println("The File is deleted.");
        } else {
            System.out.println("The File is not deleted.");
        }
    }
}
```

#### Output:

```
The File is deleted.
```

- In the above example, we have created an object of `File` named `file`. The file now holds the information about the specified file.

```java
File file = new File("file.txt");
```

- Here we have used the `delete()` method to delete the file specified by the object.

</details>

## 2.2. Java FileDescriptor Class

<details><summary>Java FileDescriptor Class</summary>

```java
import java.io.*;

public class FileDescriptorExample {
    public static void main(String[] args) {
        FileDescriptor fd = null;
        byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 };
        try {
            FileOutputStream fos = new FileOutputStream("Record.txt");
            FileInputStream fis = new FileInputStream("Record.txt");
            fd = fos.getFD();
            fos.write(b);
            fos.flush();
            fd.sync();// confirms data to be written to the disk
            int value = 0;
            // for every available bytes
            while ((value = fis.read()) != -1) {
                char c = (char) value;// converts bytes to char
                System.out.print(c);
            }
            System.out.println("\nSync() successfully executed!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

</details>

## 2.3. Java FileInputStream Class

<details><summary>Java FileInputStream Class</summary>

- The `FileInputStream` class of the `java.io` package can be used to read data (in bytes) from files.

- It extends the `InputStream` abstract class.

<img src="assets/2.3-java-fileinputstream-class/1.png">

</details>

<details><summary>Create a FileInputStream</summary>

- In oder to create a file input stream, we must the `java.io.FileInputStream` package first.

#### 1. Using the path to file

```java
FileInputStream input = new FileInputStream(stringPath);
```

#### 2. Using an object of the file

```java
FileInputStream input = new FileInputStream(File fileObject);
```

</details>

<details><summary>Methods of FileInputStream</summary>

#### read() method

Method | Description
--- | ---
`read()` | Reads a single byte from the file.
`read(byte[] array)` | Reads the bytes from the file and stores in the specified array.
`read(byte[] array, int start, int length)` | reads the number of bytes equal to `length` from the file and stores in the specified array starting from the position `start`.

### Example:

#### Input.txt

```
This is a line of text inside the file.
```

#### FileInputStreamDemo.java

```java
import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String args[]) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            System.out.println("Data in the file: ");

            // Reads the first byte
            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
```

- Or we use an array to store data from a file

```java
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
```

#### Output:

```
Data in the file:
This is a line of text inside the file.
```

</details>

## 2.4. Java FileOutputStream Class

<details><summary>Create a FileOutputStream</summary>

#### 1. Using the path file

```java
// Including the boolean parameter
FileOutputStream output = new FileOutputStream(String path, boolean value);

// Not including the boolean parameter
FileOutputStream output = new FileOutputStream(String path);
```

- `value` is an optional boolean parameter. If it is set to `true`, the new data will be appended to the end of the existing data in the file. Otherwise, the new data overwrites the existing data in the file.

#### 2. Using an object of the file

```java
FileOutputStream output = new FileOutputStream(File fileObject);
```

</details>

<details><summary>Methods of FileOutputStream</summary>

Method | Description
---|---
`write()` | writes the single byte to the file output stream
`write(byte[] array)` | writes the bytes from the specified array to the output stream
`write(byte[] array, int start, int length)` | writes the number of bytes equal to length to the output stream from an array starting from the position start

### Example: FileOutputStream to write data to a File

#### FileOutputStreamDemo.java

```java
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {

        String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("output.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
```

#### output.txt

```
This is a line of text inside the file.
```

</details>

<details><summary>flush() Method</summary>

- To clear the output stream, we can use the `flush()` method. This method forces the output stream to write all data to the destination.

### Example:

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream out = null;
        String data = "This is demo of flush method";

        try {
            out = new FileOutputStream(" flush.txt");

            // Using write() method
            out.write(data.getBytes());

            // Using the flush() method
            out.flush();
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
```

</details>

<details><summary>close() Method</summary>

- To close the file output stream, we can use the `close()` method. Once the method is called, we cannot use the methods of `FileOutputStream`

</details>