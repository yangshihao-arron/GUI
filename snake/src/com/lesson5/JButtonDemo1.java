package com.lesson5;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo1 extends JFrame {

    public JButtonDemo1(){

        Container container = this.getContentPane();
        //将一个图片变成一个图标
        URL url = JButtonDemo1.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(url);

        //把这个图标放到按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");

        container.add(button);
        setBounds(100,100,200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo1();
    }
}
