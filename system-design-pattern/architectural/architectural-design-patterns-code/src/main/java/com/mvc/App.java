package com.mvc;

import com.mvc.controller.StudentController;
import com.mvc.modal.StudentModal;
import com.mvc.view.StudentView;

import java.util.ArrayList;
import java.util.List;

class App {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        List<StudentModal> students = new ArrayList();
        StudentModal student = new StudentModal("Avinash");
        students.add(student);
        StudentController controller = new StudentController(students, view);
        controller.showStudents();
    }
}