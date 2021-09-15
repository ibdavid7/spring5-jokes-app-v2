package com.springframework.spring5jokesappv2.controllers;

import com.springframework.spring5jokesappv2.services.JokeProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    JokeProviderService jokeProviderService;

    public JokesController(JokeProviderService jokeProviderService) {
        this.jokeProviderService = jokeProviderService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeProviderService.getJoke());
        return "/index.html";
    }
}
