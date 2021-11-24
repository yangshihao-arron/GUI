package com.lesson6;

import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo1 extends JFrame {
    public TestComboboxDemo1(){

        Container container = this.getContentPane();

        JComboBox status = new JComboBox();
        status.addItem(null);
        status.addItem("正在上映");
        status.addItem("已下架");

        container.add(status);
        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TestComboboxDemo1();
    }
}
