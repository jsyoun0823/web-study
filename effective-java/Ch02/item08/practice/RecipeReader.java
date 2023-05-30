package item08.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecipeReader implements AutoCloseable{

    private BufferedReader reader;

    public RecipeReader(String path) {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    public Recipe saveRecipe() {
        Recipe recipe = null;
        String line = "";
        try {
            List<String> list = new ArrayList<>();
            while((line = this.reader.readLine()) != null) { list.add(line); }
            recipe = new Recipe(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return recipe;
    }

    @Override
    public void close() {
        throw new IllegalArgumentException();
        /*
        try {
            System.out.println("close!");
            reader.close();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
         */
    }
}