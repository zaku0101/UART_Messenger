package org.TeamProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UartGui extends JFrame {
    private JPanel mainPanel;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField formattedTextField3;
    private JFormattedTextField formattedTextField4;
    private JButton SENDDATAButton;
    private JFormattedTextField formattedTextField5;



    public UartGui() {
        SENDDATAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JFormattedTextField getFormattedTextField1() {
        return formattedTextField1;
    }

    public void setFormattedTextField1(JFormattedTextField formattedTextField1) {
        this.formattedTextField1 = formattedTextField1;
    }

    public JFormattedTextField getFormattedTextField2() {
        return formattedTextField2;
    }

    public void setFormattedTextField2(JFormattedTextField formattedTextField2) {
        this.formattedTextField2 = formattedTextField2;
    }

    public JFormattedTextField getFormattedTextField3() {
        return formattedTextField3;
    }

    public void setFormattedTextField3(JFormattedTextField formattedTextField3) {
        this.formattedTextField3 = formattedTextField3;
    }

    public JFormattedTextField getFormattedTextField4() {
        return formattedTextField4;
    }

    public void setFormattedTextField4(JFormattedTextField formattedTextField4) {
        this.formattedTextField4 = formattedTextField4;
    }
    public JFormattedTextField getFormattedTextField5() {
        return formattedTextField5;
    }

    public void setFormattedTextField5(JFormattedTextField formattedTextField5) {
        this.formattedTextField5 = formattedTextField5;
    }
}
