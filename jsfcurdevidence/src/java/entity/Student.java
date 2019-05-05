/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Md Yasin Arif
 */
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gendre;
    private String round;
    private Date startingDate;
    private boolean status;
    private String[] module;
    private String notes;

    public Student() {
    }

    public Student(int id, String name, String gendre, String round, Date startingDate, boolean status, String[] module, String notes) {
        this.id = id;
        this.name = name;
        this.gendre = gendre;
        this.round = round;
        this.startingDate = startingDate;
        this.status = status;
        this.module = module;
        this.notes = notes;
    }

    public Student(String name, String gendre, String round, Date startingDate, boolean status, String[] module, String notes) {
        this.name = name;
        this.gendre = gendre;
        this.round = round;
        this.startingDate = startingDate;
        this.status = status;
        this.module = module;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getModule() {
        return module;
    }

    public void setModule(String[] module) {
        this.module = module;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gendre=" + gendre + ", round=" + round + ", startingDate=" + startingDate + ", status=" + status + ", module=" + module + ", notes=" + notes + '}';
    }
    
}
