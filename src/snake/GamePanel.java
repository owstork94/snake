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
    private final int[] x = new int[300]; //50 40 30 20 10 0
                                          //40 30 20 ...
    private final int[] y = new int[300]; //50 50 50 50 50 50

    private final int ALL_DOTS = 300;

    //size
    private int bodyParts = 6; //뱀 길이

    private int BOX_SIZE = 10;  //뱀 굵기
    private char direction;


    public GamePanel(){
        System.out.println("GamePanel");
        //키보드 입력 반응 하게 설정.
        setFocusable(true);
        addKeyListener(this);
        Timer timer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean running = true;
                if (running){
                    System.out.println("app running.....");
                    //keyPressed 에서 방향키로 할당 한 데이터 활용 하여 이동.
                    move();
                    //간식 생성
                    //충돌처리
                }
                repaint();
            }

            private void move() {

                System.out.println("move...");
                //x축 y축 배열 한칸씩 땡겨서 이동 구현 ( 머리 위치 (x[0] , y[0] 변경 하면서 이동 구현)
                //x[0] = x[i - 1]  식으로 할당 후 switch 문으로 x축 y 축 이동 구현

//                System.out.println(x[0] -=BOX_SIZE);

                for (int i = bodyParts; i > 0; i--){
                    x[i] = x[i-1];
                    y[i] = y[i-1];
                }

                switch (direction){
                    case 'R':
                        x[0] += BOX_SIZE;
                        break;
                    case 'L':
                        x[0] -= BOX_SIZE;
                        break;
                    case 'U':
                        y[0] += BOX_SIZE;
                        break;
                    case 'D':
                        y[0] -= BOX_SIZE;
                        break;
                    case 'E':
                        y[0] = BOX_SIZE;
                        x[0] = BOX_SIZE;
                        break;

                }

            }
        });


        timer.start();
        moveSnake();
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
        //방향키 입력 하여 방향변수 할당 : 'R' 우 / 'L' 좌 ...

        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                direction = 'L';
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+direction);
                break;
            case KeyEvent.VK_RIGHT:
                direction = 'R';
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+direction);
                break;
            case KeyEvent.VK_UP:
                direction = 'U';
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+direction);
                break;
            case KeyEvent.VK_DOWN:
                direction = 'D';
                break;
            case KeyEvent.VK_SPACE:
                direction = 'E';
                break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
