package com.dili.demo.tddomain;

import java.util.Date;

/**
 * 电力
 */
public class ElectricPower {

    private Date ts;

    private Integer speed;

    private String notes;

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
