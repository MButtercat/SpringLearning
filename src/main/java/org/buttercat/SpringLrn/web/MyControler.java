package org.buttercat.SpringLrn.web;

import org.buttercat.SpringLrn.dto.Bird;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pwd")
public class MyControler {

    @GetMapping
    public String secretCodeReveal() {
        return "qwerty123!";
    }

    @GetMapping("/secret")
    public String evenMoreSecretCodeReveal() {
        return "qwerty123@#!";
    }
}

