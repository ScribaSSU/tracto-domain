package com.scribassu.tracto.domain;

public enum EventType {
    MIDTERM("Зачет"),
    EXAM("Экзамен"),
    CONSULTATION("Консультация");

    private String type;

    public String getType() { return type; }

    EventType(String type) { this.type = type; }
}
