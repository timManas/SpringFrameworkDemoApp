package timanas.springframework.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by timmanas on 2019-11-24.
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

// // This is the annotation version
//    public JokeServiceImpl() {
//        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//    }

    // For the Java and XML based configuration
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}