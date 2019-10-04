package com.scribassu.tracto.domain;

public enum TypeOfLesson {
        LECTURE ("лек."),
        PRACTICE ("практ."),
        LABORATORY ("лаб.");

    private String type;

    public String getType (){
        return type;
    }

    TypeOfLesson(String type) {
        this.type = type;
    }
}