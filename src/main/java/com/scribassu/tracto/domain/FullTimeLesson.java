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

    @ManyToOne
    private Department department;

    private String groupNumber;

    @ManyToOne
    private Day weekDay;

    @ManyToOne
    private Time lessonTime;

    private String info;

    @Enumerated(EnumType.STRING)
    private WeekType weekType;

    @Enumerated(EnumType.STRING)
    private LessonType lessonType;
}
