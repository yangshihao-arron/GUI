package com.lesson6;

import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo2 extends JFrame {
    public TestComboboxDemo2(){

        Container container = this.getContentPane();

        //生成列表的内容
        String[] contents = {"1", "2", "3"};

        //列表中需要放入内容
        JList list = new JList(contents);

        container.add(list);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TestComboboxDemo2();
    }
}
