//package item33;
//
//import java.lang.reflect.AnnotatedElement;
//
//public class Annotation {
//    static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
//        Class<?> annotationType = null; // 비한정적 타입 토큰
//        try {
//            annotationType = Class.forName(annotationTypeName);
//        } catch (Exception ex) {
//            throw new IllegalArgumentException(ex);
//        }
//        return element.getAnnotation(annotationType.asSubclass(Annotation.class));
//    }
//}