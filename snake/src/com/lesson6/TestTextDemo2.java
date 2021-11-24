package com.lesson6;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo2 extends JFrame {
    public TestTextDemo2(){
        Container container = this.getContentPane();

        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        container.add(passwordField);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo2();
    }

}
