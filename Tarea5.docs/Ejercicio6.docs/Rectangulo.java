package Tarea5.Ejercicio6;

public class Rectangulo implements Comparable<Rectangulo>{
    double ancho;
    double alto;

    public Rectangulo(int numLados, double ancho, double alto) {

        this.ancho = ancho;
        this.alto = alto;
    }


    public double getPerimeter() {
        return (ancho * 2) + (alto * 2);
    }


    public double getArea() {
        return alto * ancho;
    }

    @Override
    public int compareTo(Rectangulo o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", area=" + getArea() +
                '}';
    }

}

