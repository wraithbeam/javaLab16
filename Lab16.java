import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

class Lab16 {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Lab16");
        mainFrame.setSize(400, 400);

        TopMenu topMenu = new TopMenu();
        mainFrame.setJMenuBar(topMenu.menuBar);
        

        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
}