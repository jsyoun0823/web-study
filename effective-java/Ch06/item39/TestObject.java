package item39;

import java.io.Serializable;

public class TestObject implements Serializable {
    private String title;
    private String content;

    public TestObject(String title, String content) {
        this.title = title;
        this.content = content;
    }
}