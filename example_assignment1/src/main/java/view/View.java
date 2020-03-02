package view;

import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    private JTextArea studentTextArea;
    private JButton nextButton;

    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 120);
        frame.setVisible(true);
        // Create UI elements
        studentTextArea = new JTextArea("STUDENT");
        nextButton = new JButton("Next");
        // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(studentTextArea).addComponent(nextButton));
        layout.setVerticalGroup(layout.createSequentialGroup().addComponent(studentTextArea).addComponent(nextButton));
        frame.getContentPane().setLayout(layout);
    }
    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    public JTextArea getStudentTextArea() {
        return studentTextArea;
    }
    public void setStudentTextArea(JTextArea studentTextArea) {
        this.studentTextArea = studentTextArea;
    }

    public JButton getNextButton() {
        return nextButton;
    }
    public void setNextButton(JButton nextButton) {
        this.nextButton = nextButton;
    }
}
