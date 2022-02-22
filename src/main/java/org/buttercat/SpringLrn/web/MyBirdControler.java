package org.buttercat.SpringLrn.web;

import org.buttercat.SpringLrn.dto.Bird;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

 @RestController
@RequestMapping("bird")
public class MyBirdControler {

    Bird currentBird = new Bird();

    List<Bird> birds = new ArrayList<>();


    @GetMapping
    public Bird getBird() {
        return currentBird;
    }
    @DeleteMapping
    public String killBird() {
        currentBird = null;
        return "Done!";
    }

    @GetMapping("/all")
    public List<Bird> getAllBirds() {
        return birds;
    }

    @PostMapping
     public String addBird(@RequestBody Bird bird) {
        birds.add(bird);
        return "ok";
    }
}

