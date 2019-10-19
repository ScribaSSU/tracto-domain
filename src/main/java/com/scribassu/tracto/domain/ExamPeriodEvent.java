package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class ExamPeriodEvent {

    @Id
    @GeneratedValue
    private Long id;

    private EventType eventType;
    private int day;
    private int month;
    private int hour;
    private int minute;
    private String subjectName;
    private Teacher teacher;
    private Department department;
    private String place;
    private String groupNumber;
}