package item26.generic;

public class Message implements Entity{

    private Long id;

    private String body;

    public Message(Long id, String body) {
        this.id = id;
        this.body = body;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }
}