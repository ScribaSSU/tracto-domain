package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Teacher {
    private Long id;
    private String surname;
    private String name;
    private String patronymic;
    private Long scheduleId;
}
