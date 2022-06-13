package item33;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Favorites f = new Favorites();

        f.putFavorite(String.class, "Java");
        f.putFavorite(int.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);
        f.putFavorite(String.class, "Python");

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(int.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());

    }
}