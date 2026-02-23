package modelo.entidades;

public class ActaElectoral {
    private String numeroActa;
    private MesaElectoral mesaElectoral;
    private int totalVotosEmitidos;
    private int votosValidos;
    private int votosBlancos;
    private int votosNulos;

    private boolean validada;

    private ResultadoCandidato[] resultados;
    private int nResultados;

    public ActaElectoral() {
        resultados = new ResultadoCandidato[50];
        nResultados = 0;
        validada = false;
    }

    public ActaElectoral(String numeroActa, MesaElectoral mesaElectoral,
                         int totalVotosEmitidos, int votosValidos, int votosBlancos, int votosNulos) {
        this.numeroActa = numeroActa;
        this.mesaElectoral = mesaElectoral;
        this.totalVotosEmitidos = totalVotosEmitidos;
        this.votosValidos = votosValidos;
        this.votosBlancos = votosBlancos;
        this.votosNulos = votosNulos;
        this.validada = false;

        resultados = new ResultadoCandidato[50];
        nResultados = 0;
    }

    public String getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(String numeroActa) {
        this.numeroActa = numeroActa;
    }

    public MesaElectoral getMesaElectoral() {
        return mesaElectoral;
    }

    public void setMesaElectoral(MesaElectoral mesaElectoral) {
        this.mesaElectoral = mesaElectoral;
    }

    public int getTotalVotosEmitidos() {
        return totalVotosEmitidos;
    }

    public void setTotalVotosEmitidos(int totalVotosEmitidos) {
        this.totalVotosEmitidos = totalVotosEmitidos;
    }

    public int getVotosValidos() {
        return votosValidos;
    }

    public void setVotosValidos(int votosValidos) {
        this.votosValidos = votosValidos;
    }

    public int getVotosBlancos() {
        return votosBlancos;
    }

    public void setVotosBlancos(int votosBlancos) {
        this.votosBlancos = votosBlancos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public boolean isValidada() {
        return validada;
    }

    public void setValidada(boolean validada) {
        this.validada = validada;
    }

    public int getCantidadResultados() {
        return nResultados;
    }

    public void modificarDatos(int totalVotosEmitidos, int votosValidos, int votosBlancos, int votosNulos) {
        this.totalVotosEmitidos = totalVotosEmitidos;
        this.votosValidos = votosValidos;
        this.votosBlancos = votosBlancos;
        this.votosNulos = votosNulos;
        this.validada = false; // si se modifica, se vuelve a validar
    }

    public boolean registrarResultado(ResultadoCandidato resultado) {
        if (resultado == null) {
            return false;
        }

        if (nResultados >= resultados.length) {
            return false;
        }

        if (resultado.getCandidato() == null) {
            return false;
        }

        // Evitar repetir candidato en la misma acta
        if (buscarResultadoPorCodigoCandidato(resultado.getCandidato().getCodigo()) != null) {
            return false;
        }

        resultados[nResultados] = resultado;
        nResultados++;
        validada = false;
        return true;
    }

    public ResultadoCandidato buscarResultadoPorCodigoCandidato(String codigoCandidato) {
        for (int i = 0; i < nResultados; i++) {
            if (resultados[i].getCandidato() != null &&
                resultados[i].getCandidato().getCodigo().equalsIgnoreCase(codigoCandidato)) {
                return resultados[i];
            }
        }
        return null;
    }

    public boolean eliminarResultado(String codigoCandidato) {
        int pos = -1;

        for (int i = 0; i < nResultados; i++) {
            if (resultados[i].getCandidato() != null &&
                resultados[i].getCandidato().getCodigo().equalsIgnoreCase(codigoCandidato)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < nResultados - 1; i++) {
            resultados[i] = resultados[i + 1];
        }

        resultados[nResultados - 1] = null;
        nResultados--;
        validada = false;
        return true;
    }

    public int calcularSumaVotosCandidatos() {
        int suma = 0;
        for (int i = 0; i < nResultados; i++) {
            suma += resultados[i].getVotos();
        }
        return suma;
    }

    public int calcularSumaPreferenciales() {
        int suma = 0;
        for (int i = 0; i < nResultados; i++) {
            suma += resultados[i].getPreferenciales();
        }
        return suma;
    }

    /**
     * Validación básica:
     * total emitidos = válidos + blancos + nulos
     * suma votos candidatos <= votos válidos
     */
    public boolean validarActa() {
        if (totalVotosEmitidos < 0 || votosValidos < 0 || votosBlancos < 0 || votosNulos < 0) {
            validada = false;
            return false;
        }

        if (totalVotosEmitidos != (votosValidos + votosBlancos + votosNulos)) {
            validada = false;
            return false;
        }

        if (calcularSumaVotosCandidatos() > votosValidos) {
            validada = false;
            return false;
        }

        validada = true;
        return true;
    }

    public String listarResultados() {
        if (nResultados == 0) {
            return "No hay resultados registrados en el acta.";
        }

        String lista = "";
        for (int i = 0; i < nResultados; i++) {
            lista += (i + 1) + ". " + resultados[i] + "\n";
        }
        return lista;
    }

    public ResultadoCandidato[] getResultados() {
        ResultadoCandidato[] copia = new ResultadoCandidato[nResultados];
        for (int i = 0; i < nResultados; i++) {
            copia[i] = resultados[i];
        }
        return copia;
    }

    @Override
    public String toString() {
        return "ActaElectoral{" +
                "numeroActa='" + numeroActa + '\'' +
                ", mesa=" + (mesaElectoral != null ? mesaElectoral.getCodigo() : "null") +
                ", totalVotosEmitidos=" + totalVotosEmitidos +
                ", votosValidos=" + votosValidos +
                ", votosBlancos=" + votosBlancos +
                ", votosNulos=" + votosNulos +
                ", validada=" + validada +
                ", nResultados=" + nResultados +
                '}';
    }
}