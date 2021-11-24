package com.lesson5;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public JScrollDemo(){
        Container container = this.getContentPane();

        //文本域
        JTextArea jTextArea = new JTextArea(20,50);
        jTextArea.setText("欢迎学习");

        //Scroll面板
        JScrollPane scrollPane = new JScrollPane(jTextArea);
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JScrollDemo();
    }

}
