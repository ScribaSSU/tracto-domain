package com.scribassu.tracto.domain;

public enum Groups {
    DO("Дневная"),
    ZO("Заочная"),
    VO("Вечерняя");

    private String type;

    public String getGroups() { return type; }

    Groups(String type) { this.type = type; }
}
