package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class Time {

    @Id
    @GeneratedValue
    private Long id;

    private int lessonNumber;
    private String timeStart;
    private String timeFinish;
}
