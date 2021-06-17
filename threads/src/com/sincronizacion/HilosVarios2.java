package com.sincronizacion;

public class HilosVarios2 extends Thread {

    private Thread hilo;

    public HilosVarios2(Thread hilo) {
        this.hilo = hilo;
    }

    public void run() {

        try {
            System.out.println("Entrando en join  hilo " + getName());
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i=0; i<15; i++){
            System.out.println("Ejecutando  hilo " + getName());
        }
    }
}