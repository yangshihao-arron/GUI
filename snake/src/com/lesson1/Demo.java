package com.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//练习的Demo
public class Demo {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(400,300);
        frame.setLocation(300,400);
        //frame.setBackground(Color.black);

        //四个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        p1.add(new Button("east-1"),BorderLayout.EAST);
        p1.add(new Button("west-1"),BorderLayout.WEST);

        p2.add(new Button("p2-btn1"));
        p2.add(new Button("p2-btn2"));

        p1.add(p2,BorderLayout.CENTER);
        //下面
        p3.add(new Button("east-2"),BorderLayout.EAST);
        p3.add(new Button("west-2"),BorderLayout.WEST);
        //中间四个
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("btn-"+i));
        }
        p3.add(p4,BorderLayout.CENTER);
        frame.add(p1);
        frame.add(p3);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
