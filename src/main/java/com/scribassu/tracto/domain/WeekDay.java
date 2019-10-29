package com.scribassu.tracto.domain;

public enum WeekDay {
    MONDAY("пн."),
    TUESDAY("вт."),
    WEDNESDAY("ср."),
    THURSDAY("чт."),
    FRIDAY("пт."),
    SATURDAY("сб."),
    SUNDAY("вс.");

    private String day;

    public String getDay() {
        return day;
    }

    WeekDay(String day) {
        this.day = day;
    }
}
