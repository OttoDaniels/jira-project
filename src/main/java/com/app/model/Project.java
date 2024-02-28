package com.app.model;

public class Project {
    private long id;
    private String projectName;
    private String color;

    public Project(long id, String projectName, String color) {
        this.id = id;
        this.projectName = projectName;
        this.color = color;
    }
    public Project(){};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
