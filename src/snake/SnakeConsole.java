package snake;

public class SnakeConsole {
  private static final   int wallWitch = 10;
    private static final int wallHeight = 5;
    public static void main(String[] args) {
        startGame();

    }

    private static void startGame() {
        boolean running = true;

        while (running){
            printGame();
            move();
        }
    }

    private static void move() {
    }

    private static void printGame() {

        createSnake();
    }

    private static void createSnake() {

    }

    private static void createWall() {

        for (int i = 0; i < wallHeight; i++) {
            for (int j = 0; j < wallWitch; j++) {
                if (i == 0 || i == wallHeight - 1 || j == 0 || j == wallWitch - 1) {
                    System.out.print("#"); // 벽 출력

                }else {
                    System.out.println("#");}
            }

        }
    }
}
