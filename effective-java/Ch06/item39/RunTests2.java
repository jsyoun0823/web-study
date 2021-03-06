package item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests2 {

    public static void main(String[] args) throws Exception {
        test("Sample2");
    }

    public static void test(String className) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName(className);
        for (Method m : testClass.getDeclaredMethods()) {
            if(m.isAnnotationPresent(ExceptionTest.class)
                || m.isAnnotationPresent(ExceptionTestContainer.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
                } catch (Throwable wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    int oldPassed = passed;
                    ExceptionTest[] excTests =
                            m.getAnnotationsByType(ExceptionTest.class);
                    for (ExceptionTest excTest : excTests) {
                        if (excTest.value().isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed)
                        System.out.printf("테스트 %s 실패: %s %n", m, exc);
                }
            }
//            if (m.isAnnotationPresent(ExceptionTest.class)) {
//                tests++;
//                try {
//                    m.invoke(null);
//                    System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
//                } catch (InvocationTargetException wrappedExc) {
//                    Throwable exc = wrappedExc.getCause();
//                    Class<? extends Throwable> excType =
//                            m.getAnnotation(ExceptionTest.class).value();
//                    if(excType.isInstance(exc)) {
//                        passed++;
//                    } else {
//                        System.out.printf("테스트 %s 실패: 기대한 예외 %s, 발생한 예외 %s%n",
//                                m, excType.getName(), exc);
//                    }
//                } catch (Exception exc) {
//                    System.out.println("잘못 사용한 @ExceptionTest: " + m);
//                }
//            }
        }
        System.out.printf("성공: %d, 실패: %d%n",
                passed, tests - passed);
    }
}