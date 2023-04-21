package org.TeamProject;


public class Main {
    public static void main(String[] args) {
    UartGui gui =new UartGui();
    gui.setContentPane(gui.getMainPanel());
    gui.setTitle("UART MESSENGER");
    gui.setSize(400,300);
    gui.setVisible(true);
    }
}