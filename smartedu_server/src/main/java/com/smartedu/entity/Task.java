package com.smartedu.entity;

import java.util.Date;

public class Task {
    Long id ;
    String title;
    String content;
    Long classId;
    Date dueDate;

    public void setId(Long id) {this.id = id;}


    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public Long getClassId() {
        return classId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getContent() {
        return content;
    }


    public String getTitle() {
        return title;
    }

}

