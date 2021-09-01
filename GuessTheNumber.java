package ru.geekbrains.j1l8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessTheNumber extends JFrame {
    private int randomNumber;
    private JTextField textField_1;

    public GuessTheNumber() {
        this.randomNumber = (int)(Math.random() * 10) + 1;

        setTitle("Игра: Угадай число");
        setBounds(600, 300, 600, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField_1 = new JTextField();
        add(textField_1, BorderLayout.NORTH);
        textField_1.setText("Программа загадала число от 1 до 10");
        textField_1.setEditable(false);
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);

        Font font_1 = new Font("Arial", Font.PLAIN, 20);
        textField_1.setFont(font_1);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        buttonsPanel.setBackground(Color.BLUE);
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font_1);
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex);
                }
            });
        }

        JPanel restartPanel = new JPanel(new GridLayout(1, 1));
        restartPanel.setBackground(Color.BLUE);
        add(restartPanel, BorderLayout.SOUTH);

        JButton restart = new JButton("RESTART");
        restart.setFont(font_1);
        restartPanel.add(restart);

        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomNumber = (int)(Math.random() * 10) + 1;
                textField_1.setText("Вы перезапустили игру. Программа перезагадала число");
            }
        });

        setVisible(true);
    }

    public void tryToAnswer(int answer) {
        if(answer < randomNumber) {
            textField_1.setText("Не угадали! Загаданное число больше");
            return;
        }
        if(answer > randomNumber) {
            textField_1.setText("Не угадали! Загаданное число меньше");
            return;
        }
        textField_1.setText("Вы угадали!!! Ответ: " + randomNumber);
    }
}