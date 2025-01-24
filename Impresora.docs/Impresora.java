package Tarea2Ejercicio3;

public class Impresora {
    private int nivelDeToner;
    private int numpaginas;
    private boolean dobleCara;

    public Impresora(int numpaginas, int nivelDeToner, boolean dobleCara) {
        this.numpaginas = numpaginas;
        this.nivelDeToner = nivelDeToner;
        this.dobleCara = dobleCara;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public boolean isDobleCara() {

        return dobleCara;
    }

    public int añadirNivelToner(int ponerToner){

        nivelDeToner = nivelDeToner + ponerToner;

        if (nivelDeToner <0 || nivelDeToner >100){

            System.out.println("Error, nivel de tóner introducido incorrecto. Debes introducir entr 0 y 100.");
            return -1;

        }

        return nivelDeToner;

    }

    public int impresionPaginas(int paginasAimprimir){

        if (dobleCara){
            paginasAimprimir = paginasAimprimir*2;
        }

        numpaginas = numpaginas + paginasAimprimir;
        return paginasAimprimir;

    }
}
