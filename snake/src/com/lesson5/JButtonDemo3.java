package com.lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo3 extends JFrame {
    public JButtonDemo3(){
        Container container = this.getContentPane();
        //将一个图片变成一个图标
        URL url = JButtonDemo1.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(url);

        //多选框
        JCheckBox checkBox1 = new JCheckBox("01");
        JCheckBox checkBox2 = new JCheckBox("02");
        JCheckBox checkBox3 = new JCheckBox("03");

        container.add(checkBox1,BorderLayout.WEST);
        container.add(checkBox2,BorderLayout.CENTER);
        container.add(checkBox3,BorderLayout.EAST);
        setVisible(true);
        setBounds(100,100,200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo3();
    }
}
