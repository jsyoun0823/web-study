package item08.autoclosable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosableisGood implements AutoCloseable{

    private BufferedReader reader;

    public AutoClosableisGood(String path) {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    @Override
    public void close() {
        // 1. 첫번째 방법 -> IOException 책임 전가
        //        reader.close();

        // 2. 이 안에서 자체적으로 try-catch 처리
        try {
            reader.close();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}