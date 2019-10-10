package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EveningLesson {
    private Department department;
    private String groupNumber;
    private int day;
    private int month;
    private Time lessonTime;
    private WeekType weekType;
    private LessonType lessonType;
}
