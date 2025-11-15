package com.anonHub.anonymous_talk_backend.controller;


import com.anonHub.anonymous_talk_backend.models.Person;
import com.anonHub.anonymous_talk_backend.service.AnonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnonController {

    @Autowired
    private AnonService anonService;

    @GetMapping("/person")
    public Person getPerson() {
        return anonService.createDefaultPerson();
    }
}
