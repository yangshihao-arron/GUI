package com.lesson3;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//键
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}
class KeyFrame extends Frame{
    public KeyFrame()  {
        setBounds(100,100,300,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            //键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                //获得键盘按下的键,当前键盘的码
                int keyCode = e.getKeyCode();
                if(keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }else if(keyCode == KeyEvent.VK_DOWN)
                    System.out.println("你按下了下键");
            }
            //根据按下的不同操作，产生不同的结果。

        });
    }

}
