package com.lesson5;

import com.lesson4.JFrameDemo;

import javax.swing.*;
import java.awt.*;

public class JpanelDemo extends JFrame {
    public JpanelDemo(){
        Container container = this.getContentPane();

        container.setLayout(new GridLayout(2,1,10,10));//后面两个参数的意思，间距

        JPanel panel = new JPanel(new GridLayout(1,3));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        container.add(panel);
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}
