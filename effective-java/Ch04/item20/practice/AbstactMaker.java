package item20.practice;

// 골격 구현 클래스
public abstract class AbstactMaker {

    // 템플릿 메서드
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
    }

    // 공통 메서드들
    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    // 각 서브 클래스에서 구현할 메서드
    protected abstract void brew();
}