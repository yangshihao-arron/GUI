package com.lesson3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame {
    public WindowFrame()  {
        setBounds(100,100,200,200);
        setBackground(Color.blue);
        setVisible(true);
        //addWindowListener(new MyWindowListener());
        this.addWindowListener(new WindowAdapter() {
            //匿名内部类

            //关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
                System.exit(0);
            }

            //激活窗口
            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame windowFrame = (WindowFrame)e.getSource();
                windowFrame.setTitle("被激活了");
                System.out.println("windowActivated");
            }


        });
    }

}
