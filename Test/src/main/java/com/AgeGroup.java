package com;

public enum AgeGroup {

    U15(1),
    U16(2),
    U17(3),
    U18(4),
    U19(5),
    U20(6),
    U21(7),
    U22(8),
    U23(9);

    public final int value;

    AgeGroup(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static AgeGroup of(int value) {
        for (AgeGroup ageGroup : AgeGroup.values()) {
            if (ageGroup.getValue() == value)
                return ageGroup;
        }
        return null;
    }
}
