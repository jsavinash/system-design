package com.mvc.controller;

import com.mvc.modal.StudentModal;
import com.mvc.view.StudentView;

import java.util.List;

public class StudentController {
    List<StudentModal> students;
    StudentView view;

    public StudentController(List<StudentModal> students, StudentView view) {
        this.students = students;
        this.view = view;
    }

    public void showStudents() {
        this.view.showStudents(this.students);
    }
}