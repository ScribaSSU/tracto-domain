package com.scribassu.tracto.domain;

public enum WeekType {
    NOM("чис."),
    DENOM("знам."),
    FULL("");

    private String type;

    public String getType() { return type; }

    WeekType(String type) { this.type = type; }
}
