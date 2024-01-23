package com.factory.user;

import jakarta.persistence.Entity;

@Entity
public class Other extends ID {

    private String other;

    private Integer m;

    public Other() {

    }

    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }

    public Other(String other, Integer m) {
        this.other = other;
        this.m = m;
    }



    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}

