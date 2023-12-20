package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;

public class GamePanel extends JPanel implements KeyListener{
    private static final int DELAY = 200;
    private final int[] x = new int[300];
    private final int[] y = new int[300];

    private final int ALL_DOTS = 900;

    //size
    private int bodyParts = 6; //뱀 길이

    private int BOX_SIZE = 10;  //뱀 굵기


    public GamePanel(){
        System.out.println("GamePanel");
        setFocusable(true);
        addKeyListener(this);
        //지렁이 위치 초기화
        //x축 50 ~ 0 까지 박스 하나씩 나열sp
        //y축 50으로 고정
        for (int i = 0; i < bodyParts; i++){
            x[i] = 50 - i*10;
           // System.out.println("x["+i+"] : "+x[i]);
            y[i] = 50;
          //  System.out.println("y["+i+"] : "+y[i]);
        }
    }

    @Override
    protected void paintComponent(Graphics g){//지렁이 출력
        System.out.println("paintComponent");
            super.paintComponent(g);
            drawSnake(g);
            moveSnake();

//            g.fillRect(50,50,BOX_SIZE, BOX_SIZE);
//        g.fillRect(40,50,BOX_SIZE, BOX_SIZE);
//        g.fillRect(30,50,BOX_SIZE, BOX_SIZE);

//            System.out.println("X : "+x[i]);
//            System.out.println("y : "+y[i]);
        }

    private void moveSnake() {
        int[] x = new int[ALL_DOTS];
        int[] Y = new int[ALL_DOTS];
        boolean running = true;
        System.out.println(">>>");
        Timer timer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                boolean running = true;
                if (running){
                    System.out.println("app running.....");
                    move();
                    //간식 생성
                    //충돌처리
                }
                repaint();
            }

            private void move() {
                System.out.println("move...");
                //x축 y축 배열 한칸씩 땡겨서 이동 구현


            }

        });
        timer.start();
    }

    private void drawSnake(Graphics g) {
        for (int i = 0; i < bodyParts; i++){
            g.fillRect(x[i],y[i],BOX_SIZE, BOX_SIZE);
            System.out.print("■");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            System.out.println("go LEFT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
