package item05.springioc;

import item05.Dictionary;
//import org.springframework.context.annotation.*;

//@Configuration
public class AppConfig {

//    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker(dictionary());
    }

//    @Bean
    public Dictionary dictionary() {
        return new SpringDictionary();
    }
}