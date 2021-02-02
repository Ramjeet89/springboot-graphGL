package com.springboot.graphql.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity

public class Person {

    @Id

    private int id;
    private String name;
    private String mobile;
    private String email;
    private String[] address;

}
