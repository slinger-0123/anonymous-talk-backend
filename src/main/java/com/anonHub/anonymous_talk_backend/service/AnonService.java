package com.anonHub.anonymous_talk_backend.service;

import com.anonHub.anonymous_talk_backend.models.Person;
import com.anonHub.anonymous_talk_backend.repo.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnonService {

    @Autowired
    private PeopleRepository peopleRepository;


    public Person createDefaultPerson() {
        Person person = new Person();
        person.setName("Sanidhya");
        person.setPersonID(1);
        person.setConnected(false);
        person.setOccupied(false);
        person.setChatRoomID(1);

        return peopleRepository.save(person);
    }

    public Person updatePerson(Integer id) {
        Person person = peopleRepository.findById(id).orElse(new Person());
        person.setName("Sanidhya");
        person.setConnected(false);
        person.setOccupied(false);
        person.setChatRoomID(1);
        return peopleRepository.save(person);
    }

}
