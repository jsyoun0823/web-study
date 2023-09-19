package item26.generic;

public class Account implements Entity{

    private Long id;
    private String userName;

    public Account(Long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    public String getUserName() {
        return userName;
    }
}