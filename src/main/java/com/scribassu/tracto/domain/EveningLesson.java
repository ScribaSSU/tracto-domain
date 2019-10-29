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

    @ManyToOne
    private Department department;

    private String groupNumber;
    private int day;
    private int month;

    @ManyToOne
    private LessonTime lessonTime;

    @Enumerated(EnumType.STRING)
    private WeekType weekType;

    @Enumerated(EnumType.STRING)
    private LessonType lessonType;
}
