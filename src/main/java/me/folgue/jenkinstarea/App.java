package me.folgue.jenkinstarea;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        var frame = new JFrame();

        frame.setSize(new Dimension(800, 600));
        frame.add(new JButton("Jenkins"));
        frame.setTitle("Tarea jenkins");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
