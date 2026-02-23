package modelo.entidades;

import modelo.abstractas.Persona;
import modelo.enums.TipoMiembroMesa;

public class MiembroMesa extends Persona {
    private String codigo;
    private TipoMiembroMesa tipoMiembroMesa;

    public MiembroMesa() {
        super();
    }

    public MiembroMesa(String codigo, int dni, String nombre, String apellido, TipoMiembroMesa tipoMiembroMesa) {
        super(dni, nombre, apellido);
        this.codigo = codigo;
        this.tipoMiembroMesa = tipoMiembroMesa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoMiembroMesa getTipoMiembroMesa() {
        return tipoMiembroMesa;
    }

    public void setTipoMiembroMesa(TipoMiembroMesa tipoMiembroMesa) {
        this.tipoMiembroMesa = tipoMiembroMesa;
    }

    public void modificarDatos(int dni, String nombre, String apellido, TipoMiembroMesa tipoMiembroMesa) {
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        this.tipoMiembroMesa = tipoMiembroMesa;
    }

    @Override
    public String toString() {
        return "MiembroMesa{" +
                "codigo='" + codigo + '\'' +
                ", " + super.toString() +
                ", tipoMiembroMesa=" + tipoMiembroMesa +
                '}';
    }
}