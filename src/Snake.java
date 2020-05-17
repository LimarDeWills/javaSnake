import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
    private JPanel panel;
    private final int COLOMS = 10;
    private final int ROWS = 10;
    private final int IMAGE_SIZE = 20;

    public static void main(String[] args) {
        new Snake();
    }

    private Snake(){
        initPanel();
        initFrame();
    }
    private void initPanel(){
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(COLOMS * IMAGE_SIZE, ROWS *IMAGE_SIZE));
        panel.setBackground(Color.BLACK);
        add(panel);
    }
    private void initFrame(){
        pack();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake");
    }
}
