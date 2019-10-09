package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Department {
    private Long id;
    private String fullName;
    private String shortName;
    private String URL;
}
