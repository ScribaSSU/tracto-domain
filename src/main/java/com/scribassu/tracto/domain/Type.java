package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Type {
    public enum TypeOfLesson {
        LECTION,
        PRACTICE,
        LABORATORY
    }

    private TypeOfLesson typeOfLesson;
}
