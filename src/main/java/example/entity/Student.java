package example.entity;

import java.util.Date;

public class Student {
    private int student_id;
    private String student_name;
    private int student_age;
    private int student_grade;
    private Date student_dob;

    public Student() {
    }

    public Student(int student_id, String student_name, int student_age, int student_grade, Date student_dob) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_age = student_age;
        this.student_grade = student_grade;
        this.student_dob = student_dob;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }

    public int getStudent_grade() {
        return student_grade;
    }

    public void setStudent_grade(int student_grade) {
        this.student_grade = student_grade;
    }

    public Date getStudent_dob() {
        return student_dob;
    }

    public void setStudent_dob(Date student_dob) {
        this.student_dob = student_dob;
    }


}
