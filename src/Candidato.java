import modelo.
package modelo.entidades;


public class Candidato extends Persona {
    private String codigo;
    private int totalVotosEmitidos;
    private int totalVotosPreferenciales;

    public Candidato() {
        super();
    }

    public Candidato(String dni, String nombre, String apellido,
                     String codigo, int totalVotosEmitidos, int totalVotosPreferenciales) {
        super(dni, nombre, apellido);
        this.codigo = codigo;
        this.totalVotosEmitidos = totalVotosEmitidos;
        this.totalVotosPreferenciales = totalVotosPreferenciales;
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

    public void modificarDatos(String nombre, String apellido) {
        setNombre(nombre);
        setApellido(apellido);
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "codigo='" + codigo + '\'' +
                ", " + super.toString() +
                ", totalVotosEmitidos=" + totalVotosEmitidos +
                ", totalVotosPreferenciales=" + totalVotosPreferenciales +
                '}';
    }
}