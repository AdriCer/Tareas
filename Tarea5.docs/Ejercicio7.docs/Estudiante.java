package Tarea5.Ejercicio7;

public class Estudiante implements Comparable<Estudiante> {
    String nombre;
    int edad;
    int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante o) {
        if (this.altura != o.altura){
            return Integer.compare(o.altura, this.altura);
        }
        return Integer.compare(this.edad, o.edad);
    }

    @Override
    public String toString() {
        return nombre + "-Altura: " + altura + "- Edad: " + edad;
    }
}
