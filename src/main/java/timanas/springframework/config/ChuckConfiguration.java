package timanas.springframework.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by timmanas on 2019-11-25.
 */

//@Configuration - Uncomment this for Javabased implementatioj
public class ChuckConfiguration {

    // @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
