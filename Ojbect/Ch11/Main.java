//public class Main {
//    public static void main(String[] args) {
//
//        // 일반 요금제에 세금 정책을 조합할 경우
////        Phone phone = new Phone(
////                new TaxablePolicy(0.05,
////                        new RegularPolicy(...)));
////
////        // 일반 요금제에 기본 요금 할인 정책을 조합한 결과에 세금 정책을 조합할 경우
////        Phone phone = new Phone(
////                new TaxablePolicy(0.05,
////                        new RateDiscountablePolicy(Money.wons(1000),
////                            new RegularPolicy(...))));
////
////        // 세금 정책과 기본 요금 할인 정책이 적용되는 순서를 바꾸고 싶은 경우
////        Phone phone = new Phone(
////                new RateDiscountablePolicy(Money.wons(1000),
////                        new TaxablePolicy(0.05,
////                                new RegularPolicy(...))));
//    }
//}