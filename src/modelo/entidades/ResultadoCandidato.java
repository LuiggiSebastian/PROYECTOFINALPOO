package modelo.entidades;

public class ResultadoCandidato {
    private Candidato candidato;
    private int votos;
    private int preferenciales;

    public ResultadoCandidato() {
    }

    public ResultadoCandidato(Candidato candidato, int votos, int preferenciales) {
        this.candidato = candidato;
        this.votos = votos;
        this.preferenciales = preferenciales;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getPreferenciales() {
        return preferenciales;
    }

    public void setPreferenciales(int preferenciales) {
        this.preferenciales = preferenciales;
    }

    public void modificarDatos(int votos, int preferenciales) {
        this.votos = votos;
        this.preferenciales = preferenciales;
    }

    @Override
    public String toString() {
        return "ResultadoCandidato{" +
                "candidato=" + (candidato != null ? candidato.getCodigo() : "null") +
                ", votos=" + votos +
                ", preferenciales=" + preferenciales +
                '}';
    }
}