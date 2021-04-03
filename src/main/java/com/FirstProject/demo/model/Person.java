package com.FirstProject.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Person {
    private final UUID id;
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }
    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
