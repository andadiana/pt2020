package controller;

import model.Student;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller {

    private List<Student> students;
    private View view;
    private int currentIndex;

    public Controller(List<Student> students, View view) {
        this.students = students;
        this.view = view;
        this.currentIndex = 0;
        initView();
    }

    public void initView() {
        if (!students.isEmpty()) {
            view.getStudentTextArea().setText(students.get(currentIndex).toString());
            currentIndex++;
        }
        view.getNextButton().addActionListener(e -> showNextStudent());
    }

    private void showNextStudent() {
        Student s = getNextStudent();
        view.getStudentTextArea().setText(s.toString());
    }

    private Student getNextStudent() {
        if (currentIndex >= students.size()) {
            currentIndex = 0;
        }
        Student s = students.get(currentIndex);
        currentIndex++;
        return s;
    }
}
