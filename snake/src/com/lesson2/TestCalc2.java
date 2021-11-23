package com.lesson2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class TestCalc2 {
    public static void main(String[] args) {
        new Calculator1().loadFrame();
    }
}

//计算器类
class Calculator1 extends Frame{
    //属性
    TextField num1,num2,num3;

    //方法
    public void loadFrame(){
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        Button button = new Button("=");
        Label label = new Label("+");

        button.addActionListener(new MyCalculatorListener1(this));

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
class MyCalculatorListener1 implements ActionListener{

    //获取计算器这个对象,在一个类中组合另一个类
    Calculator1 calculator1 = null;

    public MyCalculatorListener1(Calculator1 calculator1){
        this.calculator1 = calculator1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //1获得加数和被加数
        int n1 = Integer.parseInt(calculator1.num1.getText());
        int n2 = Integer.parseInt(calculator1.num2.getText());

        //2将这个值加法运算后放到第三个框
        int n3 = n1 + n2;
        calculator1.num3.setText(String.valueOf(n3));
        //3清除前两个框
        calculator1.num1.setText("");
        calculator1.num2.setText("");
    }
}
