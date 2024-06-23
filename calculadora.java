import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSimples {

    private JFrame frame;
    private JPanel panel;
    private JTextField display;
    private JButton[] botoesNumeros;
    private JButton[] botoesOperacoes;

    private double numero1;
    private double numero2;
    private String operacao;

    public CalculadoraSimples() {
        frame = new JFrame("Calculadora Simples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 3, 10, 10));

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(display);

        botoesNumeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botoesNumeros[i] = new JButton(String.valueOf(i));
            int finalI = i;
            botoesNumeros[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String textoDisplay = display.getText();
                    if (!textoDisplay.equals("0")) {
                        textoDisplay += finalI;
                    } else {
                        textoDisplay = String.valueOf(finalI);
                    }
                    display.setText(textoDisplay);
                }
            });
        }

        botoesOperacoes = new JButton[4];
        botoesOperacoes[0] = new JButton("+");
        botoesOperacoes[1] = new JButton("-");
        botoesOperacoes[2] = new JButton("*");
        botoesOperacoes[3] = new JButton("/");

        for (int i = 0; i < 4; i++) {
            int finalI = i;
            botoesOperacoes[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    numero1 = Double.parseDouble(display.getText());
                    operacao = botoesOperacoes[finalI].getText();
                    display.setText("0");
                }
            });
        }

        JButton botaoPonto = new JButton(".");
        botaoPonto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoDisplay = display.getText();
                if (!textoDisplay.contains(".")) {
                    textoDisplay += ".";
                }
                display.setText(textoDisplay);
            }
        });

        JButton botaoIgual = new JButton("=");
        botaoIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2 = Double.parseDouble(display.getText());
                double resultado = 0;
                switch (operacao) {
                    case "+":
                        resultado = numero1 + numero2;
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        break;
                    case "*":
                        resultado = numero1 * numero2;
                        break;
                    case "/":
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            JOptionPane.showMessageDialog(frame, "Erro: Divisão por zero.");
                        }
                        break;
                }
                display.setText(String.valueOf(resultado));
            }
        });

        panel.add(botaoPonto);
        panel.add(botaoIgual);

        panel.add(botoesOperacoes[0]);
        panel.add(botoesOperacoes[1]);
        panel.add(botoesOperacoes[2]);
        panel.add(botoesOperacoes[3]);

        panel.add(botoesNumeros[7]);
        panel.add(botoesNumeros[8]);
        panel.add(botoesNumeros[9]);

        panel.add(botoesNumeros[4]);
        panel.add(botoesNumeros[5]);
        panel.add(botoesNumeros[6]);

        panel.add(botoesNumeros[1]);
        panel.add(botoesNumeros[2]);
        panel.add(botoesNumeros[3]);

        panel.add(botoesNumeros[0]);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculadoraSimples();
    }
}