package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Time {
    private Long id;
    private int lessonNumber;
    private String timeStart;
    private String timeFinish;
}
