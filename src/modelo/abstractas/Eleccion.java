package modelo.abstractas;

import java.util.Calendar;
import modelo.enums.TipoEleccion;

public abstract class Eleccion {
    private String codigo;
    private String nombre;
    private Calendar fecha;
    private boolean activa;
    private TipoEleccion tipoEleccion;

    public Eleccion() {
    }

    public Eleccion(String codigo, String nombre, Calendar fecha, boolean activa, TipoEleccion tipoEleccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.activa = activa;
        this.tipoEleccion = tipoEleccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public TipoEleccion getTipoEleccion() {
        return tipoEleccion;
    }

    public void setTipoEleccion(TipoEleccion tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
    }

    public void activar() {
        activa = true;
    }

    public void desactivar() {
        activa = false;
    }

    public void modificarDatos(String nombre, Calendar fecha, boolean activa) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.activa = activa;
    }

    public String getFechaTexto() {
        if (fecha == null) {
            return "Sin fecha";
        }

        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH) + 1; // Calendar empieza en 0
        int anio = fecha.get(Calendar.YEAR);

        return dia + "/" + mes + "/" + anio;
    }

    @Override
    public String toString() {
        return "Eleccion{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + getFechaTexto() +
                ", activa=" + activa +
                ", tipoEleccion=" + tipoEleccion +
                '}';
    }
}