package Tarea3Ejercicio4;

public class Esfera extends Forma {

    protected double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    @Override
    public double Area(){

        return 4 * Math.PI * radio * 2;


    }
}
