package item08;

import java.io.BufferedInputStream;

public class AutoClosableisGood implements AutoCloseable{

    private BufferedInputStream inputStream;


    @Override
    public void close() throws Exception {
        try {
            inputStream.close();
        } catch (Exception e) {
            throw new RuntimeException("failed");
        }
    }
}

