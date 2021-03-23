package com;

import java.util.HashSet;
import java.util.Set;

public enum Period {
    END(2, "end"),
    Q(3, "Q"),
    START(1, "start"),
    E(4, "E");

    public static Set<Period> IN_PLAY_PERIODS=new HashSet<>();

    int    val;
    String desc;

    Period(int val, String desc) {
        this.val = val;
        this.desc = desc;
    }

    static {
        IN_PLAY_PERIODS.add(START);
        IN_PLAY_PERIODS.add(END);
    }

    public Boolean isInPlayPeriod() {
        return IN_PLAY_PERIODS.contains(this);

    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
