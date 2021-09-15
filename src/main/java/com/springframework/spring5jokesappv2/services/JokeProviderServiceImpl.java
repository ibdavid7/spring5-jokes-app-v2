package com.springframework.spring5jokesappv2.services;

import com.springframework.spring5jokesappv2.models.ChuckNorrisQuote;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeProviderServiceImpl implements JokeProviderService{

    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public JokeProviderServiceImpl() {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
