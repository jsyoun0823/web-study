package item20.practice;

public class TeaMaker extends AbstactMaker{

    @Override
    protected void brew() {
        System.out.println("찻잎으로 차를 우려내는 중");
    }
}