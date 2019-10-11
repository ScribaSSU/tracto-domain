package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class EveningLesson {

    @Id
    @GeneratedValue
    private Long id;

    private Department department;
    private String groupNumber;
    private int day;
    private int month;
    private Time lessonTime;
    private WeekType weekType;
    private LessonType lessonType;
}
