package com.lesson4;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {

    //init();
    public void init(){
        //顶级窗口
        JFrame jf = new JFrame("这是一个JFrame窗口");
        jf.setVisible(true);
        jf.setBounds(100,100,200,200);
        jf.setBackground(Color.blue);
        //设置文字 JLabel
        JLabel label = new JLabel("欢迎来到");
        jf.add(label);



        //关闭事件
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        //建立一个窗口
        new JFrameDemo().init();
    }
}
