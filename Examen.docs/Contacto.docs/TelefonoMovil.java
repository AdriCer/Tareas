package UD7.Tarea1;

import java.util.ArrayList;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts = new ArrayList<>();

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacto contacto){

        if (findContact(contacto.getName()) >=0){
            return false;
        }

        myContacts.add(contacto);
        return true;

    }

    public boolean updateContact(Contacto antiguo,Contacto nuevo){

        int posicion = myContacts.indexOf(antiguo);

        if (posicion <0){
            return false;
        }

        if (findContact(nuevo) != findContact(antiguo)){
            return true;
        }

        myContacts.set(posicion,nuevo);
            return true;

    }

    public boolean removeContact(Contacto contacto){

        int encontrado = findContact(contacto.getName());

        if (encontrado >=0){
            myContacts.remove(encontrado);
            return true;
        }

        return false;

    }

    public int findContact(Contacto contacto){

        if (myContacts.contains(contacto)){
            return myContacts.indexOf(contacto);
        }

        return -1;

    }

    public int findContact(String nombre){

        int cont = 0;

        for (Contacto contacto : myContacts){

            if (contacto.getName().equalsIgnoreCase(nombre)){

                return cont;

            }

            cont++;
        }

        return -1;

    }

    public Contacto queryContact(String nombre){

        for (Contacto contacto : myContacts){

            if (nombre.equals(contacto.getName())){

                return contacto;

            }

        }

        return null;

    }

    public void printContacts(){

        System.out.println("Lista de contactos: ");

        for (Contacto contacto : myContacts){

            int numero = 1;
            System.out.println("numero" + contacto.getName() + " -> " + contacto.getPhoneNumber());

            numero++;

        }

    }
}
