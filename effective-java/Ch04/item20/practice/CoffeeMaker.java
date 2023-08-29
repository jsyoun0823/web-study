package item20.practice;

public class CoffeeMaker extends AbstactMaker{
    @Override
    protected void brew() {
        System.out.println("원두를 추출하여 커피를 우려내는 중");
    }
}