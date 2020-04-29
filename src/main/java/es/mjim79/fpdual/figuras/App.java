package es.mjim79.fpdual.figuras;

import es.mjim79.fpdual.figuras.modelo.*;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        final Punto punto = new Punto(5, 8);
        final Circulo circulo = new Circulo(punto, 10);
        circulo.pintar();
        circulo.mover(new Punto(50, 60));
        circulo.pintar();

    }
}
