##IllegalArgumentException

- java가 기본으로 제공해주는 unckecked exception
- 잘못된 인자를 넘겨 받았을 때 사용할 수 있는 기본 런타임 예외

1) checked exception vs unchecked excpetion
   - unchecked Exception : RuntimeExcpetion을 상속받는 모든 Exception, 컴파일 이후 런타임 도중 예외를 확인할 수 있다.
     - 굳이 try-catch 블럭으로 잡지 않아도 된다
   - checked Exception : Exception을 상속받는 하위 클래스 중 RuntimeExcpetion을 제외한 모든 Exception
     - 컴파일 타임에 체크해주기 때문에 예외처리를 꼭 해줘야 한다. (안그러면 컴파일 못한다.)

2) 메소드 선언부에 unchecked excpetion을 선언하는 이유는?
   - runtime Exception일지라도 클라이언트에게 직접 알려주고 싶을 때(명시적으로) 
   - 그러나 가독성을 위해 checked excpetion만 표기를 한다

3) checked excpetion은 왜 사용할까?