package modelo.entidades;

import modelo.abstractas.Persona;

public class Candidato extends Persona {

    private String codigo;
    private int totalVotosEmitidos;
    private int totalVotosPreferenciales;
    private PartidoPolitico partidoPolitico;

    public Candidato() {
        super();
    }

    public Candidato(int dni, String nombre, String apellido,
                     String codigo,
                     int totalVotosEmitidos,
                     int totalVotosPreferenciales,
                     PartidoPolitico partidoPolitico) {

        super(dni, nombre, apellido);
        this.codigo = codigo;
        this.totalVotosEmitidos = totalVotosEmitidos;
        this.totalVotosPreferenciales = totalVotosPreferenciales;
        this.partidoPolitico = partidoPolitico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTotalVotosEmitidos() {
        return totalVotosEmitidos;
    }

    public void setTotalVotosEmitidos(int totalVotosEmitidos) {
        this.totalVotosEmitidos = totalVotosEmitidos;
    }

    public int getTotalVotosPreferenciales() {
        return totalVotosPreferenciales;
    }

    public void setTotalVotosPreferenciales(int totalVotosPreferenciales) {
        this.totalVotosPreferenciales = totalVotosPreferenciales;
    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public void sumarVotos(int votos) {
        if (votos > 0) {
            totalVotosEmitidos += votos;
        }
    }

    public void sumarPreferenciales(int votosPreferenciales) {
        if (votosPreferenciales > 0) {
            totalVotosPreferenciales += votosPreferenciales;
        }
    }

    public void modificarDatos(String nombre, String apellido, PartidoPolitico partidoPolitico) {
        setNombre(nombre);
        setApellido(apellido);
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "codigo='" + codigo + '\'' +
                ", " + super.toString() +
                ", partidoPolitico=" + (partidoPolitico != null ? partidoPolitico.getNombre() : "Sin partido") +
                ", totalVotosEmitidos=" + totalVotosEmitidos +
                ", totalVotosPreferenciales=" + totalVotosPreferenciales +
                '}';
    }
}