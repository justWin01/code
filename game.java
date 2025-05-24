import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class game extends Frame implements Runnable {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private static final int PLAYER_WIDTH = 60;
    private static final int PLAYER_HEIGHT = 10;
    private static final int OBJECT_SIZE = 20;
    private static final int MAX_OBJECTS = 10;
    private static final int OBJECT_SPEED = 3;

    private int playerX = WIDTH / 2;
    private int playerY = HEIGHT - PLAYER_HEIGHT - 20;
    private List<Point> objects = new ArrayList<>();
    private Random random = new Random();
    private int score = 0;
    private boolean gameOver = false;

    public game() {
        super("Catch Game");

        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me) {
                playerX = me.getX();
                if (playerX < 0)
                    playerX = 0;
                if (playerX > WIDTH - PLAYER_WIDTH)
                    playerX = WIDTH - PLAYER_WIDTH;
            }
        });

        Thread gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!gameOver) {
                moveObjects();
                checkCollision();
            }

            repaint();
        }
    }

    private void moveObjects() {
        for (Point object : objects) {
            object.y += OBJECT_SPEED;
        }

        while (objects.size() < MAX_OBJECTS) {
            objects.add(new Point(random.nextInt(WIDTH - OBJECT_SIZE), 0));
        }

        List<Point> objectsToRemove = new ArrayList<>();
        for (Point object : objects) {
            if (object.y > HEIGHT) {
                objectsToRemove.add(object);
                if (!gameOver) {
                    gameOver = true;
                }
            }
        }
        objects.removeAll(objectsToRemove);
    }

    private void checkCollision() {
        Rectangle playerRect = new Rectangle(playerX, playerY, PLAYER_WIDTH, PLAYER_HEIGHT);
        List<Point> objectsToRemove = new ArrayList<>();
        for (Point object : objects) {
            Rectangle objectRect = new Rectangle(object.x, object.y, OBJECT_SIZE, OBJECT_SIZE);
            if (playerRect.intersects(objectRect)) {
                objectsToRemove.add(object);
                gameOver = true;
                break; // Exit loop after collision detected
            }
        }
        objects.removeAll(objectsToRemove);

        if (gameOver) {
            resetGame();
        }
    }

    private void resetGame() {
        objects.clear();
        score = 0;
        gameOver = false;
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.RED);
        g.fillRect(playerX, playerY, PLAYER_WIDTH, PLAYER_HEIGHT);

        g.setColor(Color.BLUE);
        for (Point object : objects) {
            g.fillOval(object.x, object.y, OBJECT_SIZE, OBJECT_SIZE);
        }

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, 10, 30);

        if (gameOver) {
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over", (WIDTH - 150) / 2, HEIGHT / 2 - 50);
        }
    }

    public static void main(String[] args) {
        new game();
    }
}
