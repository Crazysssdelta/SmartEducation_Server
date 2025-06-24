package com.smartedu.entity;

import java.util.Date;

public class Grade {
    Long id;
    Long studentId;
    Long taskId;
    Double score;
    Date timesstamp;

    public void setId(Long id) {
        this.id = id;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public void setTimesstamp(Date timesstamp) {
        this.timesstamp = timesstamp;
    }

    public Long getId() {
        return id;
    }

    public Date getTimesstamp() {
        return timesstamp;
    }

    public Double getScore() {
        return score;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Long getTaskId() {
        return taskId;
    }





}
