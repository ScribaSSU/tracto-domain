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

    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;

    @ManyToOne
    private Department department;

    @OneToOne
    private StudentGroup studentGroup;

    @Enumerated(EnumType.STRING)
    private ExtramuralEventType eventType;

    private String name;
    private String place;
    private String teacher;
}
