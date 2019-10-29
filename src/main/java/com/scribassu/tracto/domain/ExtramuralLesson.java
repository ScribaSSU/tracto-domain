package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "extramural_lesson")
@Data
@NoArgsConstructor
public class ExtramuralLesson {

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

    private String info;

    @Enumerated(EnumType.STRING)
    private LessonType lessonType;
}
