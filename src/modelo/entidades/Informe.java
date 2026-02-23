package modelo.entidades;

import java.util.Calendar;

public class Informe {
    private String codigo;
    private String titulo;
    private String contenido;
    private Calendar fechaGeneracion;

    public Informe() {
    }

    public Informe(String codigo, String titulo, String contenido, Calendar fechaGeneracion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Calendar getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Calendar fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public void modificarDatos(String titulo, String contenido, Calendar fechaGeneracion) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getFechaTexto() {
        if (fechaGeneracion == null) {
            return "Sin fecha";
        }

        int dia = fechaGeneracion.get(Calendar.DAY_OF_MONTH);
        int mes = fechaGeneracion.get(Calendar.MONTH) + 1;
        int anio = fechaGeneracion.get(Calendar.YEAR);

        return dia + "/" + mes + "/" + anio;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fechaGeneracion=" + getFechaTexto() +
                '}';
    }
}