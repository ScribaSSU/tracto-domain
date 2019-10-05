package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExamPeriodEvent {
    private EventType eventType;
    private int day;
    private int month;
    private int hour;
    private int minute;
    private String nameOfSubject;
    private Teacher teacher;
    private Department department;
    private String place;
    private String groupNumber;
}