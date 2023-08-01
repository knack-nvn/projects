package com.example.employe.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeModel {
    @Id
    private int sno;
    private String name;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
