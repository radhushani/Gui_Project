package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleButtons extends JFrame {

    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label;

    public SimpleButtons(){
        this.setContentPane(panel);
        this.setTitle("SimpleButtons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.button1.addActionListener(e -> label.setText("0"));
        this.button2.addActionListener(e -> label.setText("1"));
        this.button3.addActionListener(e -> label.setText("2"));
        this.button4.addActionListener(e -> label.setText("3"));

    }

    //main method
    public static void main(String[] args) {
        SimpleButtons gui=new SimpleButtons();
        gui.setSize(300,350);
        gui.setVisible(true);
    }
}
