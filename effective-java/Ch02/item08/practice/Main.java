package item08.practice;

import java.io.IOException;

public class Main {
    public static void main(String[] args){

        try(RecipeReader recipeReader = new RecipeReader("C:\\Study\\coffeeRecipe.txt")) {
            Recipe recipe = recipeReader.saveRecipe();

            recipe.content.forEach(System.out::println);
        }
    }
}