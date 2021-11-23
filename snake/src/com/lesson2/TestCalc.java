package com.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TestCalc {
    public static void main(String[] args) {
        new Calculator();
    }
}

//计算器类
class Calculator extends Frame{
    public Calculator(){
        //3个文本框
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);

        //1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener(num1,num2,num3));
        //1个标签
        Label label = new Label("+");

        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);

    }
}

//监听器类
class MyCalculatorListener implements ActionListener{

    //获取3个变量
    private TextField num1;
    private TextField num2;
    private TextField num3;

    public MyCalculatorListener(TextField num1, TextField num2, TextField num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
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
