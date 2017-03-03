package com.example.edgar.fryweek7;

/**
 * Created by edgar on 3/03/17.
 */

public class Student {
    private String name;
    private float grade;

    public String getName(){return name;}
    public float getGrade(){return this.grade;}

    public Student(String name, float grade){
        this.name = name;
        this.grade = grade;
    }
}
