package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExamPeriodEvent {
    private EventType eventType;
    int day;
    int month;
    int hour;
    int minute;
    String nameOfSubject;
    Teacher teacher;
    Department department;
    String place;
    String groupNumber;
}