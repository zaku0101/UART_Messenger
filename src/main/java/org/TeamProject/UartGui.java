package org.TeamProject;

import javax.swing.*;
import java.awt.*;

public class UartGui {
    private JFrame frame = new JFrame();
    private JPanel mainPanel;
    private JButton sendDataButton;
    private JButton loadDataButton;
    private JTextField valueField;
    private JComboBox idBox;
    private JComboBox speedBox;




    public UartGui() {
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/java/org/images/image.png");
        frame.setContentPane(mainPanel);
        frame.setTitle("UART MESSENGER");
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setIconImage(icon);
        frame.setFont(Font.getFont(Font.SANS_SERIF));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        sendDataButton.addActionListener(e -> {
            System.out.println("Data sent");
        });

        loadDataButton.addActionListener(e -> {
            Data data=new Data(idBox.getSelectedItem().toString(),speedBox.getSelectedItem().toString(),valueField.getText());
            System.out.println(data.getId()+" "+data.getBaudRate()+" "+ data.getValue());


        });
    }

}
