public class BuilderTest {
    public static void main(String[] args) {
        NutritionFacts cola = new NutritionFacts.Builder(240, 8)
                .calories(100).fat(27).build();
    }
}
