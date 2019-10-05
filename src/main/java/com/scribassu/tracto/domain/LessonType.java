package com.scribassu.tracto.domain;

public enum LessonType {
    LECTURE("лек."),
    PRACTICE("практ."),
    LABORATORY("лаб.");

    private String type;

    public String getType() {
        return type;
    }

    LessonType(String type) {
        this.type = type;
    }
}