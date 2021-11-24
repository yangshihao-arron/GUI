package com.lesson6;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo1 extends JFrame {
    public TestTextDemo1(){
        Container container = this.getContentPane();

        JTextField textField1 = new JTextField("hello");
        JTextField textField2 = new JTextField("world",20);

        container.add(textField1,BorderLayout.SOUTH);
        container.add(textField2,BorderLayout.NORTH);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo1();
    }

}
