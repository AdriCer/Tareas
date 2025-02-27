package UD7.Tarea1;

import java.util.Scanner;

public class MainTelefono {

    private static TelefonoMovil tel1 = new TelefonoMovil("133244355");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;


        while(!salir){
            imprimirMenu();
            System.out.println("Elige una opción: ");
            int respuesta = sc.nextInt();
            sc.nextLine();

            switch (respuesta){

                case 0:
                    System.out.println("Has salido del programa.");
                    break;

                case 1:

                    tel1.printContacts();
                    break;

                case 2:
                    agregarContacto();
                    break;

                case 3:
                    actualizarContacto();
                    break;

                case 4:
                    eliminarContacto();
                    break;

                case 5:
                    buscarContacto();
                    break;

                case 6:
                    imprimirMenu();
                    break;

            }

        }

    }

    private static void imprimirMenu(){

        System.out.println("Elige una opción del menú: (i - vii)");

        System.out.println("i. 0: Salir. ");
        System.out.println("ii. 1: imprimir contactos. ");
        System.out.println("iii. 2: agregar un nuevo contacto. ");
        System.out.println("iv. 3: actualizar un contacto existente. ");
        System.out.println("v. 4: eliminar contacto de la lista. ");
        System.out.println("vi. 5: buscar/encontrar contacto por nombre. ");
        System.out.println("vii. 6: volver a imprimir la lista de opciones. ");

    }

    private static void agregarContacto(){

        System.out.println("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce el número de teléfono");
        String telefono = sc.nextLine();

        Contacto nuevo = new Contacto(nombre,telefono);

        if (tel1.addNewContact(nuevo)){
            System.out.println("Contacto agregado correctamente");
        } else {
            System.out.println("El contacto ya existe.");
        }

    }

    private static void actualizarContacto(){

        System.out.println("Introduce el nombre del contacto que deseas actualizar: ");
        String nombre = sc.nextLine();
        Contacto existente = tel1.queryContact(nombre);

        if (existente == null){
            System.out.println("El contacto no existe");
        }

        System.out.println("Introduce el nuevo contacto: ");
        String nombrenuevo = sc.nextLine();
        System.out.println("Introduce el nuevo número de teléfono");
        String nuevotel = sc.nextLine();
        Contacto nuevo = Contacto.createContact(nombrenuevo,nuevotel);

        if (tel1.updateContact(existente,nuevo)){
            System.out.println("Se ha actualizado el contacto correctamente");
        } else {
            System.out.println("Error, el contacto ya existe o no ha podido actualizarse");
        }

    }

    private static void eliminarContacto(){

        System.out.println("Introduce el nombre del contacto que deseas eliminar");
        String nombre = sc.nextLine();

        Contacto existente = tel1.queryContact(nombre);

        if (existente == null){
            System.out.println("El contacto no existe");
        }

        if (tel1.removeContact(existente)){
            System.out.println("El contacto ha sido eliminado de forma correcta.");
        } else{
            System.out.println("Ha ocurrido un error. No se ha podido eliminar el contacto");
        }

    }

    private static void buscarContacto(){

        System.out.println("Introduce el nombre del contacto que deseas buscar: ");
        String nombre = sc.nextLine();

        Contacto contacto = tel1.queryContact(nombre);

        if (contacto == null){
            System.out.println("El contacto que se ha buscado no existe");
        } else{
            System.out.println("Nombre" + contacto.getName() + ", el número de contacto es: " + contacto.getPhoneNumber());
        }
    }
}
