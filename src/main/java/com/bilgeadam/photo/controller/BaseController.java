package com.bilgeadam.photo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public abstract class BaseController {

    @GetMapping("/hello")
    public String hello() {
        /**
         * return ne olacak?
         */
        return "Hello, World!";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id) {
        return "Get by id: " + id;
    }
}
