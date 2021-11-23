package com.lesson3;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

//鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

//自己的类
class MyFrame extends Frame{
    //画画需要画笔，需要监听当前鼠标的位置，需要集合来存储这些点
    private ArrayList<Point> points;
    public MyFrame(String title) {
        super(title);
        setBounds(200,200,400,300);

        //存鼠标的点
        points = new ArrayList<>();

        //鼠标监听器，正对这个窗口
        this.addMouseListener(new MyMouseListener());
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标事件
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point = (Point)iterator.next();
            g.setColor(Color.blue);
            g.fillOval(point.x,point.y,10,10);
        }
    }

    //添加一个点到界面上
    public void addPoint(Point point){
        points.add(point);
    }

    private class MyMouseListener extends MouseAdapter {
        //鼠标 按下，弹起，按住不放
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame)e.getSource();
            //点击的时候，就会在界面上产生一个点
            //这个点就是鼠标的点：
            myFrame.addPoint( new Point(e.getX(),e.getY()));

            //每次点击鼠标都需要重画一次
            myFrame.repaint(); //刷新
        }
    }
}