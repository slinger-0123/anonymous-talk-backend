package com.anonHub.anonymous_talk_backend.repo;

import com.anonHub.anonymous_talk_backend.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends MongoRepository<Person,Integer>{

}
