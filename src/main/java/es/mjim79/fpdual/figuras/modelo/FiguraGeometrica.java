package es.mjim79.fpdual.figuras.modelo;

public abstract class FiguraGeometrica extends Object implements Movible {

    private Punto punto;

    public Punto getPunto() {
        return this.punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public void mover(Punto puntoDestino) {
        System.out.println("Moviendo figura geométrica a la posición " + puntoDestino.toString());
        System.out.println();
        this.punto = puntoDestino;

    }

}
