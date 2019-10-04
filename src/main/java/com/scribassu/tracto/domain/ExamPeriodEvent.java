package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExamPeriodEvent {
    private enum TypeOfEvent {
        MIDTERM,
        EXAM,
        CONSULTATION
    }

    private TypeOfEvent typeOfEvent;
    int day;
    int month;
    int hour;
    int minute;
    String nameOfSubject;
    Long teacherID;
    Long departmentID;
    String place;
    int groupNumber;
}