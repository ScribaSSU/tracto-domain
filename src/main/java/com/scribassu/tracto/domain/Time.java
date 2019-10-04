package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Time {
    private int hour;
    private int minute;
    private int second;
}
