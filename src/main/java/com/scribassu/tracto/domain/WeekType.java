package com.scribassu.tracto.domain;

public enum WeekType {
    ODD("чис."),
    EVEN("знам."),
    BOTH(" ");

    private String type;

    public String getType() { return type; }

    WeekType(String type) { this.type = type; }
}
