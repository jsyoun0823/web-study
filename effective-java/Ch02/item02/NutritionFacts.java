package item02;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;

    public static class Builder {

        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수 - 기본 값으로 초기화
        private int calories = 0;
        private int fat = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        // setter 역할 메소드, return이 void가 아닌 Builder가 반환값
        public Builder calories(int val) {
            calories = val;
            return this;
        }
        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
    }

    // 플루언트 API (fluent API) 또는 메서드 연쇄(method chaining)
    // 필수 매개변수를 필수적으로 받아오게끔 강제
    public static void main(String[] args) {
        NutritionFacts cola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .fat(27)
                .build();
    }
}