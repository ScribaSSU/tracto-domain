package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "extramural_event")
@Data
@NoArgsConstructor
public class ExtramuralEvent {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private ExamPeriodMonth month;
    private int day;
    private String year;

    @ManyToOne
    private Department department;

    @OneToOne
    private StudentGroup studentGroup;

    @ManyToOne
    private LessonTime lessonTime;

    @Enumerated(EnumType.STRING)
    private ExtramuralEventType eventType;

    private String name;
    private String place;
    private String teacher;
}
