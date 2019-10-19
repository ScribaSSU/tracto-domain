package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeacherLesson {
    
    private Long id;
    
    private Teacher teacher;
    private int dayOfWeek;
    private Time lessonTime;
    private String info;
    private WeekType weekType;
    private LessonType type;
}
