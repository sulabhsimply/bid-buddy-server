package com.buddy.bid.model;

public enum CarType {
    HASHBACK("Hashback"), SUV("suv"), SEDAN("sedan");

    private final String value;

    CarType(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
