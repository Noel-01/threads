package com.sincronizacion;

public class HilosVarios extends Thread {

    public void run() {

        for(int i=0; i<15; i++){
            System.out.println("Ejecutandoo  hilo " + getName());
        }
    }
}
