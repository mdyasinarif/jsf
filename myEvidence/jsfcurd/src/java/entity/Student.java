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
    private String gender;
    private String round;
    private String cource;
    private Date startingDate;
    private String nots;

    public Student() {
    }

    public Student(int id, String name, String gender, String round, String cource, Date startingDate, String nots) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.round = round;
        this.cource = cource;
        this.startingDate = startingDate;
        this.nots = nots;
    }

    public Student(String name, String gender, String round, String cource, Date startingDate, String nots) {
        this.name = name;
        this.gender = gender;
        this.round = round;
        this.cource = cource;
        this.startingDate = startingDate;
        this.nots = nots;
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

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public String getNots() {
        return nots;
    }

    public void setNots(String nots) {
        this.nots = nots;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", round=" + round + ", cource=" + cource + ", startingDate=" + startingDate + ", nots=" + nots + '}';
    }

    

    

    
    
}
