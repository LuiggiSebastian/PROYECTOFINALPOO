package modelo.entidades;

import modelo.abstractas.Persona;

public class Candidato extends Persona {
    private String codigo;
    private int votosObtenidos;
    private int votosPreferenciales;
    private PartidoPolitico partidoPolitico; // puede ser null al inicio

    // =========================
    // Constructores
    // =========================
    public Candidato() {
        this("", 0, "", "", null);
    }

    public Candidato(String codigo, int dni, String nombres, String apellidos) {
        this(codigo, dni, nombres, apellidos, null);
    }

    public Candidato(String codigo, int dni, String nombres, String apellidos, PartidoPolitico partidoPolitico) {
        super(dni, nombres, apellidos);
        this.codigo = codigo;
        this.votosObtenidos = 0;
        this.votosPreferenciales = 0;
        this.partidoPolitico = partidoPolitico;
    }

    // =========================
    // Getters y Setters
    // =========================
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getVotosObtenidos() {
        return votosObtenidos;
    }

    public int getVotosPreferenciales() {
        return votosPreferenciales;
    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    // =========================
    // Métodos de negocio
    // =========================
    public void sumarVotos(int cantidad) {
        if (cantidad > 0) {
            votosObtenidos += cantidad;
        }
    }

    public void sumarPreferenciales(int cantidad) {
        if (cantidad > 0) {
            votosPreferenciales += cantidad;
        }
    }

    public void reiniciarConteo() {
        votosObtenidos = 0;
        votosPreferenciales = 0;
    }

    public void modificarDatos(int dni, String nombres, String apellidos) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public void modificarDatos(int dni, String nombres, String apellidos, PartidoPolitico partidoPolitico) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.partidoPolitico = partidoPolitico;
    }

    public boolean tienePartido() {
        return partidoPolitico != null;
    }

    public String obtenerNombrePartido() {
        if (partidoPolitico != null) {
            return partidoPolitico.getNombre();
        }
        return "Sin partido";
    }

    public String obtenerSiglaPartido() {
        if (partidoPolitico != null) {
            return partidoPolitico.getSigla();
        }
        return "-";
    }

    public void mostrarDatos() {
        System.out.println("=== CANDIDATO ===");
        System.out.println("Código: " + codigo);
        System.out.println("DNI: " + dni);
        System.out.println("Nombre completo: " + getNombreCompleto());
        System.out.println("Partido: " + obtenerNombrePartido() + " (" + obtenerSiglaPartido() + ")");
        System.out.println("Votos obtenidos: " + votosObtenidos);
        System.out.println("Votos preferenciales: " + votosPreferenciales);
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "codigo='" + codigo + '\'' +
                ", dni=" + dni +
                ", nombre='" + getNombreCompleto() + '\'' +
                ", partido='" + obtenerNombrePartido() + '\'' +
                ", votosObtenidos=" + votosObtenidos +
                ", votosPreferenciales=" + votosPreferenciales +
                '}';
    }
}