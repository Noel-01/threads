package com.threads;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/*
    Lamina que dibuja pelotas
 */
public class LaminaPelota extends JPanel {

    private ArrayList<Pelota> pelotas = new ArrayList<>();

    //A�adimos pelota a la l�mina

    public void add(Pelota b) {

        pelotas.add(b);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (Pelota b : pelotas) {

            g2.fill(b.getShape());
        }

    }

}