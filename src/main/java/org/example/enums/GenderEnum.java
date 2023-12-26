package org.example.enums;

public enum GenderEnum {
    MALE("Kişi"), FEMALE("Qadın");

    private final String description;

    GenderEnum(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
