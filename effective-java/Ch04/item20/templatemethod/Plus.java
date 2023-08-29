package item20.templatemethod;

// 템플릿 메서드 패턴
public class Plus extends FileProcessor{
    public Plus(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        return result + number;
    }
}