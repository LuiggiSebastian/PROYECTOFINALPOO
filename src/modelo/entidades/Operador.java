package modelo.entidades;

import modelo.abstractas.Persona;

public class Operador extends Persona {
    private String username;
    private String password;
    private boolean activo;

    public Operador() {
        super();
    }

    public Operador(int dni, String nombre, String apellido,
                    String username, String password, boolean activo) {
        super(dni, nombre, apellido);
        this.username = username;
        this.password = password;
        this.activo = activo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean autenticar(String user, String pass) {
        return activo && username.equals(user) && password.equals(pass);
    }

    @Override
    public String toString() {
        return "Operador{" +
                "username='" + username + '\'' +
                ", activo=" + activo +
                ", " + super.toString() +
                '}';
    }
}
