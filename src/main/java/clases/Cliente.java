package clases;

public class Cliente {
    //atributo
    public String nombre;
    public String cedula;
    public int edad;
    public String celular;
    public boolean aplicadescuento;

    //cnstructor

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, int edad, String celular, boolean aplicadescuento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.celular = celular;
        this.aplicadescuento = aplicadescuento;
    }

    //metodo
    public String saludar(){
        return "oe";
    }

}
