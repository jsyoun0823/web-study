package item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFacotry {

    public static void main(String[] args) {

        // 지금 현재 참조할 수 있는 HelloService를 구현한 모든 구현체를 가져온다
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h -> {
            System.out.println(h.hello());
        });

        // 정적 팩터리가 있다면, 인터페이스를 구현하지 않아도 된다
        // resources > META_INF > services > 구현체의 인터페이스의 full-package 경로
        // 위 코드는 다른 프로젝트에 구현한 ChineseHelloService에 의존적이지 않다. import 안해도 된다.
        // 어떤 구현체가 올지 전혀 모르는 상태에서도 사용할 수 있는 코드이다.

        // HelloService helloService = new SomeHelloService();
        // 얘는 어떤 구현체가 올지 명확하게 알고 있고 import 해야한다.
    }
}