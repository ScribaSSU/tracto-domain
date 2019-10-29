package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "evening_lesson")
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

    @Enumerated(EnumType.STRING)
    private WeekType weekType;

    @Enumerated(EnumType.STRING)
    private LessonType lessonType;
}
