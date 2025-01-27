package Tarea3Ejercicio4;

public class Cilindro extends Forma{

    protected double radio;
    protected double altura;

    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }
    @Override
    public double Area(){

        return Math.PI * radio * radio * altura;

    }


}
