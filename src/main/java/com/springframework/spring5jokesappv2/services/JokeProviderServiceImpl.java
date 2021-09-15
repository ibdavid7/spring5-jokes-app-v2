package com.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeProviderServiceImpl implements JokeProviderService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeProviderServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        String res = chuckNorrisQuotes.getRandomQuote();
        System.out.println(res);
        return res;
    }
}
