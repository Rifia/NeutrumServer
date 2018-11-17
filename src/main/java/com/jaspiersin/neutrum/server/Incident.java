package com.jaspiersin.neutrum.server;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "incident_list")
public class Incident {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "text")
    private String text;
    @Column(name = "grade")
    private int grade;
    @Column(name = "date")
    private Date date = new Date(new java.util.Date().getTime());

    public Incident() {

    }

    public Incident(String text, int grade) {
        this.text = text;
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
