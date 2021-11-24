package com.lesson5;

import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo2 extends JFrame {
    public JButtonDemo2(){
        Container container = this.getContentPane();
        //将一个图片变成一个图标
        URL url = JButtonDemo1.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(url);

        //单选框
        JRadioButton radioButton1 = new JRadioButton("01");
        JRadioButton radioButton2 = new JRadioButton("02");
        JRadioButton radioButton3 = new JRadioButton("03");

        //不能同时选择，分成一个组
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        container.add(radioButton1,BorderLayout.CENTER);
        container.add(radioButton2,BorderLayout.NORTH);
        container.add(radioButton3,BorderLayout.SOUTH);

        setVisible(true);
        setBounds(100,100,200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo2();
    }
}
