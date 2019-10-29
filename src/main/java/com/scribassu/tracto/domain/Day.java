package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "day")
@Data
@NoArgsConstructor
public class Day {
    @Id
    @GeneratedValue
    private Long id;

    private int dayNumber;

    @Enumerated(EnumType.STRING)
    private WeekDay weekDay;
}
