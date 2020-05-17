import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
    private JPanel panel;
    public static void main(String[] args) {
        new Snake();
    }

    private Snake(){
        initPanel();
        initFrame();
    }
    private void initPanel(){
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
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
