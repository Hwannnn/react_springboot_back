package com.nts.bts.report.sample.controller;

import com.nts.bts.report.sample.model.Movie;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {
    @GetMapping("/hello")
    @CrossOrigin("http://localhost:3000")
    public List<Movie> welcome() {
        List<Movie> movies = new ArrayList<>();

        Movie starWars = new Movie();
        starWars.setTitle("star wars");
        starWars.setPoster("http://imgmovie.naver.com/mdi/mi/1000/100072_P77_104127.jpg");
        movies.add(starWars);

        Movie oldBoy = new Movie();
        oldBoy.setTitle("old boy");
        oldBoy.setPoster("https://upload.wikimedia.org/wikipedia/ko/thumb/4/48/Old_Boy.jpg/250px-Old_Boy.jpg");
        movies.add(oldBoy);

        return movies;
    }

}
