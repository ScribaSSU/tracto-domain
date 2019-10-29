package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "teacher_lesson")
@Data
@NoArgsConstructor
public class TeacherLesson {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private Teacher teacher;
    private int dayOfWeek;
    private Time lessonTime;
    private String info;

    @Enumerated(EnumType.STRING)
    private WeekType weekType;

    @Enumerated(EnumType.STRING)
    private LessonType type;
}
