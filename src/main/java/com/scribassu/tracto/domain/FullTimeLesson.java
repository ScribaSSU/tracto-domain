package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "full_time_lesson")
@Data
@NoArgsConstructor
public class FullTimeLesson {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String place;

    @ManyToOne
    private Department department;

    @OneToOne
    private StudentGroup studentGroup;

    private String subGroup;

    @ManyToOne
    private Day weekDay;

    @ManyToOne
    private LessonTime lessonTime;

    @Enumerated(EnumType.STRING)
    private WeekType weekType;

    @Enumerated(EnumType.STRING)
    private LessonType lessonType;
}
