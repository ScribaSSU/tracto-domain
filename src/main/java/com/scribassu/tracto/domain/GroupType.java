package com.scribassu.tracto.domain;

public enum GroupType {
    DO("Дневная"),
    ZO("Заочная"),
    VO("Вечерняя");

    private String type;

    public String getGroupType() {
        return type;
    }

    GroupType(String type) {
        this.type = type;
    }
}
