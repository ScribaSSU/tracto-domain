package com.scribassu.tracto.domain;

public enum EducationForm {
    DO("Дневная"),
    ZO("Заочная"),
    VO("Вечерняя");

    private String type;

    public String getGroupType() {
        return type;
    }

    EducationForm(String type) {
        this.type = type;
    }
}
