package com.maxim.Tutorial1.student;

import java.time.LocalDate;

public class Student {
    private String firstname;
    private String lastname;
    private LocalDate dataOfBirth;
    private String email;
    private int age;

    public Student() {
    }

    public Student(String firstname, String lastname, LocalDate dataOfBirth, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dataOfBirth = dataOfBirth;
        this.email = email;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
