/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentrecord;

/**
 *
 * @author the-brain
 */
public class Student {
    
    
    private String firstname ;
    private String  surname;
    private String  middlename;

    public Student(String firstname, String surname, String middlename) {
        this.firstname = firstname;
        this.surname = surname;
        this.middlename = middlename;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }
    
    public void Hello(){
    
        System.out.println("Hello World");
    
    }
    
    
    
    
}
