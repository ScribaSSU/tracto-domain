package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FullTimeLesson {
    private Department department;
    private String groupNumber;
    private int dayOfWeek;
    private Time timeOfLesson;
    private String info;
    private WeekType typeOfWeek;
    private LessonType lessonType;
}
