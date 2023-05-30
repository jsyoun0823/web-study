package item08.practice;

import java.io.IOException;

public class Main {
    public static void main(String[] args){

        // 1. try-finally
        RecipeReader recipeReader1 = null;
        RecipeReader recipeReader2 = null;

        try {
            recipeReader1 = new RecipeReader("C:\\Study\\coffeeRecipe.txt");
            Recipe recipe1 = recipeReader1.saveRecipe();

            recipe1.content.forEach(System.out::println);

            try {
                recipeReader2 = new RecipeReader("C:\\Study\\coffeeRecipe.txt");
            } finally {
                recipeReader2.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            recipeReader1.close();
        }

        // 2. try-with-resource
        try(RecipeReader recipeReaderWith = new RecipeReader("C:\\Study\\coffeeRecipe.txt");
            RecipeReader recipeReaderWith2 = new RecipeReader("C:\\Study\\coffeeRecipe.txt")) {

            Recipe recipe3 = recipeReaderWith.saveRecipe();

            recipe3.content.forEach(System.out::println);
        }
    }
}