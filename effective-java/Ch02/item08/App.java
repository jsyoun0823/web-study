package item08;

import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {

        try (AutoClosableisGood good = new AutoClosableisGood()){
            // TODO 자원 반납 처리가 됨
        }
    }
}