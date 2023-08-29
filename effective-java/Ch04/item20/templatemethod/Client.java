package item20.templatemethod;

// 템플릿 콜백 패턴
public class Client {
    public static void main(String[] args) {
        FileProcessor2 fileProcessor2 = new FileProcessor2("number.txt");
        System.out.println(fileProcessor2.process(Integer::sum));
    }
}