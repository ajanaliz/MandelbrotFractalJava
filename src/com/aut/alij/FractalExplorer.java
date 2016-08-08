package com.aut.alij;

import javax.swing.*;

/**
 * Created by Ali J on 8/8/2016.
 */
public class FractalExplorer extends JFrame {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;

    public FractalExplorer(){
        setInitialGUIProperties();
    }

    private void setInitialGUIProperties() {
        setTitle("Fractal Explorer -- Ali J.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new FractalExplorer();
    }
}
