/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

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
    private String gender;
    private String round;
    private Date startDate;
    private boolean status;
    private String[] completedModule;
    private String notes;

    public Student() {
    }

    public Student(int id, String name, String gender, String round, Date startDate, boolean status, String[] completedModule, String notes) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.round = round;
        this.startDate = startDate;
        this.status = status;
        this.completedModule = completedModule;
        this.notes = notes;
    }

    public Student(String name, String gender, String round, Date startDate, boolean status, String[] completedModule, String notes) {
        this.name = name;
        this.gender = gender;
        this.round = round;
        this.startDate = startDate;
        this.status = status;
        this.completedModule = completedModule;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getCompletedModule() {
        return completedModule;
    }

    public void setCompletedModule(String[] completedModule) {
        this.completedModule = completedModule;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", round=" + round + ", startDate=" + startDate + ", status=" + status + ", completedModule=" + completedModule + ", notes=" + notes + '}';
    }
    
    
}
