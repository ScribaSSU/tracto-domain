package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class FullTimeLesson {

    @Id
    @GeneratedValue
    private Long id;

    private Department department;
    private String groupNumber;
    private int dayOfWeek;
    private Time lessonTime;
    private String info;
    private WeekType weekType;
    private LessonType lessonType;
}
