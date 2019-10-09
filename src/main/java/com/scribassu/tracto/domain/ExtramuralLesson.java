package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExtramuralLesson {
    private Department department;
    private String groupNumber;
    private int day;
    private int month;
    private Time lessonTime;
    private String info;
    private LessonType lessonType;
}
