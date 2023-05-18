package com.parishjain.RandomJokesApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class JokesController {

    static ArrayList<String> jokes = new ArrayList<>();



    @PostMapping(value = "/jokes")
    public String saveJokes(@RequestBody String joke){
        jokes.add(joke);
        return "Joke Saved";
    }


    @GetMapping(value = "/jokes")
    public String getJokes(){

        jokes.add(" I failed math so many times at school");
        jokes.add("I used to have a handle on life, but then it broke");
        jokes.add("I heard there were a bunch of break-ins over at the car park. That is wrong on so many levels.");
        jokes.add("When life gives you melons, you might be dyslexic");
        jokes.add("The problem with kleptomaniacs is that they always take things literally");
        jokes.add("Never trust atoms; they make up everything.");
        jokes.add("I was addicted to the hokey pokey, but then I turned myself around");

        // Random Picking Jokes
        Random rand = new Random();
        int num = rand.nextInt(jokes.size()-1);

        return jokes.get(num);
    }
}
