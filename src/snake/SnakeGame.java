package snake;

import javax.swing.*;
import java.awt.*;

public class SnakeGame extends JFrame {

    public SnakeGame(){

        setTitle("Snake Game");//게임 타이틀
        setSize(300,300);//프레임 사이즈
        setLocationRelativeTo(null);//창 중앙으로
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임 닫기 버튼

        //지렁이 삽입
        add(new GamePanel());

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame jFrame = new SnakeGame();
            jFrame.setVisible(true);
        });
    }
}
