package UD7.Tarea1;

public class Contacto {
    String name;
    String phoneNumber;

    public Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto createContact(String nomPersona, String phoneNumber){

        Contacto contacto = new Contacto("Juan","987 34 65 18");
        return  contacto;

    }


}
