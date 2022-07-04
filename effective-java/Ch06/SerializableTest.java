import item39.TestObject;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(new TestObject("title1", "blabla.."));
    }
}