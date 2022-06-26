package Lecture;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lecture lecture = new Lecture("객체지향 프로그래밍",
                70,
                Arrays.asList(81, 95, 75, 50, 45));

        String evaluration = lecture.evaluate();
        System.out.println(evaluration);

        Lecture gradeLecture = new GradeLecture("객체지향 프로그래밍",
                                70,
                                Arrays.asList(new Grade("A", 100, 95),
                                              new Grade("B", 94, 80),
                                              new Grade("C", 79, 70),
                                              new Grade("D", 69, 50),
                                              new Grade("F", 49, 0)),
                                Arrays.asList(81, 95, 75, 50, 45));

        System.out.println(gradeLecture.evaluate());
//        (GradeLecture)gradeLecture.gradeCount();
        /*

           [0621 스터디 추가내용]
            Lecture에는 없고 GradeLecture에만 있는 메서드 등은 gradeLecture 에서 호출 불가능
            왜냐? Lecture gradeLecture = new GradeLecture; 이거 선언했을 때 Lecture Class의 정보만 메모리에 올려놓기 때문에,.
            그치만 GradeLecture 에서 오버라이딩한 메소드를 호출하면 GradeLecture의 메소드를 호출!!

        */
    }
}