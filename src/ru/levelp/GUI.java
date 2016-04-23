package ru.levelp;

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

/**
 * Created by Юлия on 23.04.2016.
 */
public class GUI extends JFrame {

    public GUI() {
        JButton[] numberButton = new JButton[10];
        for (int i = 0; i < 10; i++)

        {
            numberButton[i] = new JButton(Integer.toString(i));
        }
        System.out.println(numberButton[1]);
        JButton MCButton = new JButton("MC");
        JButton MRButton = new JButton("MR");
        JButton MSButton = new JButton("MS");
        JButton MplusButton = new JButton("M+");
        JButton MminusButton = new JButton("M-");
        JButton backButton = new JButton("Back");
        JButton CEButton = new JButton("CE");
        JButton cButton = new JButton("C");
        JButton plusminusButton = new JButton("+/-");
        JButton sqrtButton = new JButton("Sqrt");
        JButton divideButton = new JButton("/");
        JButton multipleButton = new JButton("*");
        JButton minusButton = new JButton("-");
        JButton plusButton = new JButton("+");
        JButton percentButton = new JButton("%");
        JButton transpButton = new JButton("1/x");
        JButton equalButton = new JButton("=");
        JButton comaButton = new JButton(",");
        JTextField textField = new JTextField();
        Font font = new Font("Times New Roman", BOLD, 38);
        setFont(font);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 320, 500);
        setTitle("Calculator");


        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        GridBagConstraints c = new GridBagConstraints();

        c.anchor = GridBagConstraints.SOUTH;
        c.fill = GridBagConstraints.BOTH;
        c.gridheight = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(2, 2, 2, 2);
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 0.0;
        c.weighty = 0.2;
        gbl.setConstraints(textField, c);
        add(textField);


        c.gridy = 1;
        c.gridwidth = 1;

        gbl.setConstraints(MCButton, c);
        add(MCButton);
        c.gridx = 1;

        gbl.setConstraints(MRButton, c);
        add(MRButton);
        c.gridx = 2;
        gbl.setConstraints(MSButton, c);
        add(MSButton);
        c.gridx = 3;
        gbl.setConstraints(MplusButton, c);
        add(MplusButton);
        c.gridx = 4;
        gbl.setConstraints(MminusButton, c);
        add(MminusButton);
        c.gridx = 0;
        c.gridy = 2;
        gbl.setConstraints(backButton, c);
        add(backButton);

        c.gridx = 1;
        gbl.setConstraints(CEButton, c);
        add(CEButton);
        c.gridx = 2;
        gbl.setConstraints(cButton, c);
        add(cButton);
        c.gridx = 3;
        gbl.setConstraints(plusminusButton, c);
        add(plusminusButton);
        c.gridx = 4;
        gbl.setConstraints(sqrtButton, c);
        add(sqrtButton);
        c.gridx = 0;
        c.gridy = 3;
        gbl.setConstraints(numberButton[7], c);
        add(numberButton[7]);
        c.gridx = 1;
        gbl.setConstraints(numberButton[8], c);
        add(numberButton[8]);
        c.gridx = 2;
        gbl.setConstraints(numberButton[9], c);
        add(numberButton[9]);
        c.gridx = 3;
        gbl.setConstraints(divideButton, c);
        add(divideButton);
        c.gridx = 4;
        gbl.setConstraints(percentButton, c);
        add(percentButton);
        c.gridx = 0;
        c.gridy = 4;
        gbl.setConstraints(numberButton[4], c);
        add(numberButton[4]);
        c.gridx = 1;
        gbl.setConstraints(numberButton[5], c);
        add(numberButton[5]);
        c.gridx = 2;
        gbl.setConstraints(numberButton[6], c);
        add(numberButton[6]);
        c.gridx = 3;
        gbl.setConstraints(multipleButton, c);
        add(multipleButton);
        c.gridx = 4;
        gbl.setConstraints(transpButton, c);
        add(transpButton);
        c.gridx = 0;
        c.gridy = 5;
        gbl.setConstraints(numberButton[1], c);
        add(numberButton[1]);
        c.gridx = 1;
        gbl.setConstraints(numberButton[2], c);
        add(numberButton[2]);
        c.gridx = 2;
        gbl.setConstraints(numberButton[3], c);
        add(numberButton[3]);
        c.gridx = 3;
        gbl.setConstraints(minusButton, c);
        add(minusButton);
        c.gridx = 4;
        c.gridheight = 2;
        gbl.setConstraints(equalButton, c);
        add(equalButton);
        c.gridx = 0;
        c.gridy = 6;
        c.gridheight = 1;
        c.gridwidth = 2;
        gbl.setConstraints(numberButton[0], c);
        add(numberButton[0]);
        c.gridx = 2;
        c.gridwidth = 1;
        gbl.setConstraints(comaButton, c);
        add(comaButton);
        c.gridx = 3;
        gbl.setConstraints(plusButton, c);
        add(plusButton);


    }

    public void start() {
        setVisible(true);
    }


}

