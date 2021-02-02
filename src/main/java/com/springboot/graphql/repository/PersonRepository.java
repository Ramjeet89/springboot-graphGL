package com.springboot.graphql.repository;

import com.springboot.graphql.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    Person findByEmail(String email);

}

