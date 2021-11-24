package snake;

import javax.swing.*;

//游戏主启动类
public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setBounds(10,10,900,720);
        //窗口大小不可变
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //正常游戏界面应该放到面板上
        frame.add(new GamePanel());

        frame.setVisible(true);
    }
}
