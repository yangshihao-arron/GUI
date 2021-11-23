package com.lesson1;

import java.awt.*;

//GUI第一个界面
public class TestFrame {
    public static void main(String[] args) {

        //Frame，看源码
        Frame frame = new Frame("我的第一个java图形界面窗口");

        //设置可见性  w   h
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //设置背景颜色  Color
        frame.setBackground(new Color(34, 147, 79));

        //弹出的初始位置
        frame.setLocation(200,200);

        //设置大小固定
        frame.setResizable(false);
    }
}
