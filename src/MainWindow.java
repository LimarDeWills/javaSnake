import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 325);
        setLocation(400,400);
        add(new Snake());
        setVisible(true);
        //pack();
        //setResizable(false);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
