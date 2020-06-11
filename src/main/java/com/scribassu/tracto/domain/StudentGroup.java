package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student_group")
@Data
@NoArgsConstructor
public class StudentGroup {

    @Id
    @GeneratedValue
    private Long id;

    private String groupNumber;

    private String groupNumberRus;

    @ManyToOne
    private Department department;

    @Enumerated(EnumType.STRING)
    private EducationForm educationForm;

    @Enumerated(EnumType.STRING)
    private GroupType groupType;
}
