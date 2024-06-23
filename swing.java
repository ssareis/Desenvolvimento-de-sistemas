import javax.swing.*;

public class ExemploSwing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Olá, Mundo!");
        frame.getContentPane().add(label);

        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}