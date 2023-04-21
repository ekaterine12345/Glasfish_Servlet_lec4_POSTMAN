package com.example.glassfish_servlet_lec4.utils;

import com.example.glassfish_servlet_lec4.models.Student;

public class StudentUtil {

    private StudentUtil() {
    }

    public static Student getTestStudent(String first_name, String last_name, int age){
        return new Student(first_name, last_name,age);
    }
}
