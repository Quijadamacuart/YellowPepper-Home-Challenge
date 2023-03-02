package com.swagger.petstore.automation.test.model;

import lombok.Data;

@Data
public class Tag {

    private int id;
    private String name;

    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
