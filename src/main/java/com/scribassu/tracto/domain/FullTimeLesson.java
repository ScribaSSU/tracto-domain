package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FullTimeLesson {
    private Department department;
    private String groupNumber;
    private int dayOfWeek;
    private Time lessonTime;
    private String info;
    private WeekType weekType;
    private LessonType lessonType;
}
