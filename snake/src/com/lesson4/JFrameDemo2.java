package com.lesson4;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo2 {
    public static void main(String[] args) {
        new MyJframe2().init();
    }

}
class MyJframe2 extends JFrame{
    public void init(){
        this.setVisible(true);
        setBounds(100,100,300,400);

        //设置文字 JLabel
        JLabel label = new JLabel("欢迎来到");
        this.add(label);
        //设置文本标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER);


        //获得一个容器
        Container container = this.getContentPane();
        container.setBackground(Color.yellow);
    }
}
