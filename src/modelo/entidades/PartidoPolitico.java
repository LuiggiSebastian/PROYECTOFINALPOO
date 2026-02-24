package modelo.entidades;

import modelo.abstractas.Eleccion;

public class PartidoPolitico {
    private String codigo;
    private String nombre;
    private String sigla;
    private String logo;
    private String representanteLegal;
    private Eleccion eleccion;

    public PartidoPolitico() {
    }

    public PartidoPolitico(String codigo, String nombre, String sigla,
                           String logo, String representanteLegal,
                           Eleccion eleccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representanteLegal = representanteLegal;
        this.eleccion = eleccion;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }

    public void modificarDatos(String nombre, String sigla, String logo, String representanteLegal) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.representanteLegal = representanteLegal;
    }

    @Override
    public String toString() {
        return "PartidoPolitico{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sigla='" + sigla + '\'' +
                ", logo='" + logo + '\'' +
                ", representanteLegal='" + representanteLegal + '\'' +
                ", eleccion=" + (eleccion != null ? eleccion.getNombre() : "Sin elección") +
                '}';
    }
}