
package modelo.abstractas;

public abstract class Persona {
    protected int dni;
    protected String nombres;
    protected String apellidos;

    public Persona() {
    }

    public Persona(int dni, String nombres, String apellidos) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }

    public void mostrarDatosBasicos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
    }
}
    

