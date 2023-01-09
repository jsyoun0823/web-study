
이전 String Pool 에서는 String 객체 생성 방식에 따라 값 비교의 결과가 달라질 수 있다는 것을 알아보았다.
그렇다면 정수형의 경우는 어떨까?

*** 

```java
Integer a = 100;
Integer b = 100;
```
위 코드에서 a == b 의 결과는 참이다. 
a와 b가 값을 주소 값을 가리키고 있기 때문이며, 이 같은 일이 가능한 것은 Auto-Boxing 때문이다.

## AutoBoxing

Java에는 크게 2가지 데이터 타입이 있다.
### Primitive Data
- int, long, char, boolean과 같은 가벼운 데이터이다.
- Stack 영역에 존재한다.

### Object Data
- 상대적으로 무거운 데이터로, 실제 데이터는 Heap 영역에 공유하며 주소 값은 Stack 영역에 있다.

Primitive Data 를 Object Data 객체로 포장해주는 클래스를 Wrapper Class라고 한다. 
기본 자료타입인 Primitive 타입을 객체로 다루기 위해서 사용한다. 
이처럼 기본 타입의 값을 Wrapper Class로 만드는 과정을 Boxing 이라고 한다.
이러한 Boxing을 컴파일러가 자동으로 작업해주는 것이 **AutoBoxing**이다.

다시 돌아와서, AutoBoxing으로 인해 위 코드는 컴파일러에 의해 아래와 같은 코드로 변환된다.
```java
Integer a = Integer.valueOf(100);
Integer b = Integer.valueOf(100);
```
Integer.valueOf() 메소드는 캐시 범위에 해당하는 object를 반환한다.
따라서 a와 b는 같은 object를 가리키고 있으므로 a == b 는 참이다.

## IntegerCache
- Integer 클래스에서는 내부에서 integer 사용을 위해 IntegerCache를 관리한다. 
- valueOf() 메서드를 살펴보면, 파라미터 값이 캐싱된 최소값과 최대값 사이에 있다면 미리 캐시된 값을 반환해주며, 그렇지 않으면 Integer 인스턴스를 생성해 반환해준다.
  - 그리고 이 최소값과 최대값 사이라는 건 -127 ~ 128 이다. ==> 이유는 이 사이의 값이 아주 빈번하게 사용되는 값이기 때문이다. 
  
따라서 Java는 자주 쓰이는 수 (-127 ~ 128 사이의 수) 를 미리 캐싱하고, 이 사이의 값을 생성하여 초기화할 경우 새로운 객체를 사용하는 것이 아닌 캐싱해둔 값을 반환해 메모리를 효율적으로 관리한다. 

```java
Integer c = 300;
Integer d = 300;
```
300은 -127 ~ 128 사이의 값이 아니기 때문에 캐싱된 값이 아니며, 때문에 새로운 Integer 객체를 반환할 것이다.
따라서 c == d 의 결과는 거짓이다.

