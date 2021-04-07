package javaLevel1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomFrame {
    private final JPanel panel;

    public BottomFrame(JTextField inputField) {

        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 3));

        DigitButtonListener buttonListener = new DigitButtonListener(inputField);
        for (int i = 0; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            panel.add(btn);
        }

        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        panel.add(clear);

        JButton point = new JButton(".");
        point.addActionListener(buttonListener);
        panel.add(point);

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton minus = new JButton("-");
        minus.addActionListener(buttonListener);
        panel.add(minus);

        JButton multiply = new JButton("*");
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton divide = new JButton("/");
        divide.addActionListener(buttonListener);
        panel.add(divide);

        JButton sqrt = new JButton("sqrt");
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Math.sqrt(Double.parseDouble(inputField.getText()));
                inputField.setText(Double.toString(value));
            }
        });
        panel.add(sqrt);

        JButton result = new JButton("=");
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            StringCalculation calculation = new StringCalculation();
            inputField.setText(calculation.result(inputField.getText()));
            }
        });
        panel.add(result);

    }

    public JPanel getPanel() {
        return panel;
    }
}
