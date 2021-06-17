package com.threads;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    Marco con lamina y botes
 */
public class MarcoRebote extends JFrame {

    private LaminaPelota lamina;
    private  Thread t1, t2, t3;
    private JButton arranca1, arranca2, arranca3, detener1, detener2, detener3;

    public MarcoRebote(){

        setBounds(600,300,600,350);

        setTitle ("Rebotes");

        lamina=new LaminaPelota();

        add(lamina, BorderLayout.CENTER);

        JPanel laminaBotones=new JPanel();

        arranca1 = new JButton("Hilo1");
        arranca2 = new JButton("Hilo2");
        arranca3 = new JButton("Hilo3");
        detener1 = new JButton("Detener1");
        detener2 = new JButton("Detener2");
        detener3 = new JButton("Detener3");

        arranca1.addActionListener(this::comienza_el_juego);
        arranca2.addActionListener(this::comienza_el_juego);
        arranca3.addActionListener(this::comienza_el_juego);

        detener1.addActionListener(this::detener);
        detener2.addActionListener(this::detener);
        detener3.addActionListener(this::detener);

        laminaBotones.add(arranca1);
        laminaBotones.add(arranca2);
        laminaBotones.add(arranca3);
        laminaBotones.add(detener1);
        laminaBotones.add(detener2);
        laminaBotones.add(detener3);

        add(laminaBotones, BorderLayout.SOUTH);
    }


    //A�ade pelota y la bota

    public void comienza_el_juego (ActionEvent e){

        Pelota pelota=new Pelota();
        lamina.add(pelota);

        Runnable r = new PelotaHilos(pelota, lamina);

        if(e.getSource().equals(arranca1)) {
            t1 = new Thread(r);
            t1.start();
        }
        if(e.getSource().equals(arranca2)) {
            t2 = new Thread(r);
            t2.start();
        }
        if(e.getSource().equals(arranca3)) {
            t3 = new Thread(r);
            t3.start();
        }
    }

    public void detener(ActionEvent e) {
        if(e.getSource().equals(detener1)){
            t1.interrupt();
        }
        if(e.getSource().equals(detener2)){
            t2.interrupt();
        }
        if(e.getSource().equals(detener3)){
            t3.interrupt();
        }

    }
}