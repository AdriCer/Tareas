package Tarea3Ejercicio4;

import Poliformismo.Animal;

import java.text.Normalizer;
import java.util.ArrayList;

public class MainPintura {
    public static void main(String[] args) {

        Pintura pintura1 = new Pintura(250.0);
        Esfera esfera1 = new Esfera("Esfera Num1",15.0);
        Rectangulo rectangulo1 = new Rectangulo("Rectangulo Num1",20.0,35.0);
        Cilindro cilindro1 = new Cilindro("Cilindro Num1", 10.0, 30.0);


        System.out.println("Cantidad de pintura necesaria para el: " + rectangulo1 + ":" + pintura1.canPintura(cilindro1));

    }

}
