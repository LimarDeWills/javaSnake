import javax.swing.*;
import java.awt.*;

public class Snake extends JPanel {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = (int) Math.pow(SIZE / DOT_SIZE, 2);
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean up = false;
    private boolean down = false;
    private boolean left = false;
    private boolean right = true;
    private boolean inGame = true;


    public Snake() {
        initPanel();

    }

    private void initPanel() {
        setBackground(Color.BLACK);

    }

    public void loadImages(){
        apple = getImage("apple");
        dot = getImage("dot");
    }

    private Image getImage(String name) {
        String fileName = "img/" + name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(fileName));
        return icon.getImage();
    }
}

