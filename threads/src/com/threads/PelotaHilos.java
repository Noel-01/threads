package com.threads;

import java.awt.*;

public class PelotaHilos implements Runnable {

    private Pelota pelota;
    private Component componente;

    public PelotaHilos(Pelota unaPelota, Component unComponente) {
        this.pelota = unaPelota;
        this.componente = unComponente;
    }

    @Override
    public void run() {
//        for (int i=1; i<=3000; i++){
//        while(!Thread.interrupted()){
        while (!Thread.currentThread().isInterrupted()) {

            pelota.mueve_pelota(componente.getBounds());

            componente.paint(componente.getGraphics());

            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }
}
