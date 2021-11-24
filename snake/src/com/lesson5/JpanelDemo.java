package com.lesson5;

import javax.swing.*;
import java.awt.*;

public class JpanelDemo extends JFrame {
    public JpanelDemo(){
        Container container = this.getContentPane();

        container.setLayout(new GridLayout(2,1,10,10));//后面两个参数的意思，间距

        JPanel panel = new JPanel(new GridLayout(1,3));
        JPanel panel2 = new JPanel(new GridLayout(1,2));
        JPanel panel3 = new JPanel(new GridLayout(2,1));
        JPanel panel4 = new JPanel(new GridLayout(3,2));

        panel.add(new JButton("1"));
        panel.add(new JButton("1"));
        panel.add(new JButton("1"));
        panel2.add(new JButton("2"));
        panel2.add(new JButton("2"));
        panel3.add(new JButton("3"));
        panel3.add(new JButton("3"));
        container.add(panel);
        container.add(panel2);
        container.add(panel3);
        setVisible(true);
        setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JpanelDemo();
    }
}
