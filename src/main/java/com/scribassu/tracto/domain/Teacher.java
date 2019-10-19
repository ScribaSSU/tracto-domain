package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue  
    private Long id;
  
    private String surname;
    private String name;
    private String patronymic;
    private Long scheduleId;
}
