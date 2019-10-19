package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue
    private Long id;

    private String groupNumber;
    private Department department;
    private GroupType groupType;
}
