package item08.autoclosable;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try(AutoClosableisGood autoClosableisGood = new AutoClosableisGood("")) {
            // TODO 자원 반납 처리가 됨.

        }

        // 첫번째 방법이면 이 아래처럼 catch 해야함
        //catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}