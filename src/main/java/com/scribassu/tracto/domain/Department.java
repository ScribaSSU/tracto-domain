package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue
    private Long id;

    private String fullName;
    private String shortName;
    private String URL;
}
