import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        pack();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake");
        add(new Snake());
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
