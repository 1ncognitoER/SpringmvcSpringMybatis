package com.czy.ssm.model;

public class Persons {
    private int to_id;
    private String to_name;
    private int to_age;
    private String to_content;

    public Persons(int to_id, String to_name, int to_age, String to_content) {
        this.to_id = to_id;
        this.to_name = to_name;
        this.to_age = to_age;
        this.to_content = to_content;
    }

    public Persons() {
    }

    @Override
    public String toString() {
        return "Persons{" +
                "to_id=" + to_id +
                ", to_name='" + to_name + '\'' +
                ", to_age=" + to_age +
                ", to_content='" + to_content + '\'' +
                '}';
    }

    public int getTo_id() {
        return to_id;
    }

    public String getTo_name() {
        return to_name;
    }

    public int getTo_age() {
        return to_age;
    }

    public String getTo_content() {
        return to_content;
    }

    public void setTo_id(int to_id) {
        this.to_id = to_id;
    }

    public void setTo_name(String to_name) {
        this.to_name = to_name;
    }

    public void setTo_age(int to_age) {
        this.to_age = to_age;
    }

    public void setTo_content(String to_content) {
        this.to_content = to_content;
    }

}
