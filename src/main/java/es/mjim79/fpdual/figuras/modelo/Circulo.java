package es.mjim79.fpdual.figuras.modelo;

public class Circulo extends FiguraGeometrica implements Pintable {

    private int radio;

    public Circulo(Punto centro, int radio) {
        this.setPunto(centro);
        this.radio = radio;
    }

    public int getRadio() {
        return this.radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Circulo) {
            final Circulo circulo = (Circulo)obj;
            return (circulo.getRadio() == this.radio && circulo.getPunto().equals(this.getPunto()));
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.radio + this.getPunto().hashCode();
    }

    public void pintar() {
        System.out.println("Circulo: " + this.getPunto().toString());
        System.out.println("         Radio: " + this.radio);
        System.out.println();
    }

}
