package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class Type {

    @Id
    @GeneratedValue
    private Long id;

    private LessonType lessonType;
}
