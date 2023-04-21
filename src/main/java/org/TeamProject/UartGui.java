package org.TeamProject;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class UartGui {
    private JFrame frame = new JFrame();
    private JPanel mainPanel;
    private JButton SENDDATAButton;
    private JButton loadDataButton;
    private JTextField textField1;
    private JComboBox valueBox;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;

    private JTextField[] textFields = {textField1, textField2, textField3, textField4, textField5};

    public UartGui() {
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/java/org/images/image.png");
        frame.setContentPane(mainPanel);
        frame.setTitle("UART MESSENGER");
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setIconImage(icon);
        frame.setFont(Font.getFont(Font.SANS_SERIF));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        SENDDATAButton.addActionListener(e -> {
            System.out.println("Data sent");
        });

        loadDataButton.addActionListener(e -> {



        });
    }
}
