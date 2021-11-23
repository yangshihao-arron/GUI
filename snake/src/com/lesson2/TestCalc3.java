package com.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TestCalc3 {
    public static void main(String[] args) {
        new Calculator2().loadFrame();
    }
}

//计算器类
class Calculator2 extends Frame{
    //属性
    TextField num1,num2,num3;

    //方法
    public void loadFrame(){
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        Button button = new Button("=");
        Label label = new Label("+");

        button.addActionListener(new MyCalculatorListener2());

        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);

    }
    //监听器类
    //内部类的好处，可以畅通无阻的访问外部类的属性和方法
    private class MyCalculatorListener2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //1获得加数和被加数
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());

            //2将这个值加法运算后放到第三个框
            int n3 = n1 + n2;
            num3.setText(String.valueOf(n3));
            //3清除前两个框
            num1.setText("");
            num2.setText("");
        }
    }
}


