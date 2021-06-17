package com.sincronizacion;

public class SincronizacionHilos {

    public static void main(String[] args) {

        /* Asi siempre va a empezar el primero y hasta que no acabe no
        * comenzará el hilo 2 */

        HilosVarios hilo1 = new HilosVarios();
        HilosVarios2 hilos2 = new HilosVarios2(hilo1);

        hilos2.start();
        hilo1.start();



        System.out.println("Este syso se ejecuta con el hilo del Main");
    }
}
