package Tarea2Ejercicio3;

public class MainEncapsulacion {
    public static void main(String[] args) {

        Impresora impresora1 = new Impresora(10, 100, true);
        System.out.println("Toner añadido es de:" + impresora1.añadirNivelToner(50));
        System.out.println("Paginas a imprimir: " + impresora1.impresionPaginas(15));
        System.out.println("Páginas totales: " + impresora1.getNumpaginas());

    }
}
