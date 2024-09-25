/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentrecord;

/**
 *
 * @author the-brain
 */
public class StudentRecord {

    public static void main(String[] args) {
        
        Student object = new Student("firstname","surname","middlename");
        System.out.println(object.getFirstname());
        System.out.println(object.getMiddlename());
        System.out.println(object.getSurname());
        object.Hello();
        
      
    }
}
