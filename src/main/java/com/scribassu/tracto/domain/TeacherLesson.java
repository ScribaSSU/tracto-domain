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

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private Day weekDay;

    @ManyToOne
    private Time lessonTime;

    private String info;

    @Enumerated(EnumType.STRING)
    private WeekType weekType;

    @Enumerated(EnumType.STRING)
    private LessonType type;
}
