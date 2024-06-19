package com.mvc.view;

import com.mvc.modal.StudentModal;

import java.util.Iterator;
import java.util.List;

public class StudentView {
    public void showStudents(List<StudentModal> students) {
        Iterator itr = students.iterator();
        while (itr.hasNext()) {
            StudentModal modal = (StudentModal) itr.next();
            System.out.println(modal.getName());
        }
    }
}