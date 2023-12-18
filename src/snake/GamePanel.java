package snake;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private final int[] x = new int[300];
    private final int[] y = new int[300];

    //size
    private int bodyParts = 6; //뱀 길이

    private int BOX_SIZE = 10;  //뱀 굵기


    public GamePanel(){
        //게임 초기화 (지렁이 위치 초기화)
        //
    }

    @Override
    protected void paintComponent(Graphics g){
            super.paintComponent(g);
            //사각형 그리는건데 이걸로 지렁이 형상 만들어야함.(x축,y축,width,height)
            g.fillRect(100,50,1000, BOX_SIZE);
    }


}
