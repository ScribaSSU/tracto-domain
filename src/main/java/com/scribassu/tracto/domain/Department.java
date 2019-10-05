package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Department {
    Long id;
    String fullName;
    String shortName;
    String URL;
}
