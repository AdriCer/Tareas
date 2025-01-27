package Tarea3Ejercicio4;

public class Pintura {
    protected double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double canPintura(Forma forma){

        return forma.Area()/cobertura;

    }
}
