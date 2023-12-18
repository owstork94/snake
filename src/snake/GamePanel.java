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
        System.out.println("GamePanel");
        //지렁이 위치 초기화
        //x축 50 ~ 0 까지 박스 하나씩 나열
        //y축 50으로 고정
        for (int i = 0; i < bodyParts; i++){
            x[i] = 50 - i*10;
            System.out.println("x["+i+"] : "+x[i]);
            y[i] = 50;
            System.out.println("y["+i+"] : "+y[i]);
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        System.out.println("paintComponent");
            super.paintComponent(g);
            //사각형 그리는건데 이걸로 지렁이 형상 만들어야함.(x축,y축,width,height)
//            g.fillRect(50,50,BOX_SIZE, BOX_SIZE);
//        g.fillRect(40,50,BOX_SIZE, BOX_SIZE);
//        g.fillRect(30,50,BOX_SIZE, BOX_SIZE);
//        g.fillRect(20,50,BOX_SIZE, BOX_SIZE);
//        g.fillRect(10,50,BOX_SIZE, BOX_SIZE);
        for (int i = 0; i < bodyParts; i++){
            g.fillRect(x[i],y[i],BOX_SIZE, BOX_SIZE);
            System.out.println("X : "+x[i]);
            System.out.println("y : "+y[i]);
        }

    }


}
