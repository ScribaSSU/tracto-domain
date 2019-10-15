package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Group {
    private Long id;
    private String groupNumber;
    private Department department;
    private GroupType groupType;
}
