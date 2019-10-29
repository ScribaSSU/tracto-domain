package com.scribassu.tracto.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "group")
@Data
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue
    private Long id;

    private String groupNumber;

    @ManyToOne
    private Department department;

    @Enumerated(EnumType.STRING)
    private GroupType groupType;
}
