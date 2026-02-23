package modelo.entidades;

public class MesaElectoral {
    private String codigo;
    private String ubicacion;
    private int totalVotantesHabilitados;

    private MiembroMesa[] miembros;
    private int nMiembros;

    public MesaElectoral() {
        miembros = new MiembroMesa[3]; // presidente, secretario, vocal
        nMiembros = 0;
    }

    public MesaElectoral(String codigo, String ubicacion, int totalVotantesHabilitados) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.totalVotantesHabilitados = totalVotantesHabilitados;
        miembros = new MiembroMesa[3];
        nMiembros = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTotalVotantesHabilitados() {
        return totalVotantesHabilitados;
    }

    public void setTotalVotantesHabilitados(int totalVotantesHabilitados) {
        this.totalVotantesHabilitados = totalVotantesHabilitados;
    }

    public void modificarDatos(String ubicacion, int totalVotantesHabilitados) {
        this.ubicacion = ubicacion;
        this.totalVotantesHabilitados = totalVotantesHabilitados;
    }

    public boolean registrarMiembro(MiembroMesa miembro) {
        if (miembro == null) {
            return false;
        }

        if (nMiembros >= miembros.length) {
            return false; // mesa llena (máx 3)
        }

        // Evitar repetir código
        if (buscarMiembro(miembro.getCodigo()) != null) {
            return false;
        }

        // Evitar repetir rol (solo un presidente, un secretario, un vocal)
        for (int i = 0; i < nMiembros; i++) {
            if (miembros[i].getTipoMiembroMesa() == miembro.getTipoMiembroMesa()) {
                return false;
            }
        }

        miembros[nMiembros] = miembro;
        nMiembros++;
        return true;
    }

    public MiembroMesa buscarMiembro(String codigoMiembro) {
        for (int i = 0; i < nMiembros; i++) {
            if (miembros[i].getCodigo().equalsIgnoreCase(codigoMiembro)) {
                return miembros[i];
            }
        }
        return null;
    }

    public boolean eliminarMiembro(String codigoMiembro) {
        int pos = -1;

        for (int i = 0; i < nMiembros; i++) {
            if (miembros[i].getCodigo().equalsIgnoreCase(codigoMiembro)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < nMiembros - 1; i++) {
            miembros[i] = miembros[i + 1];
        }

        miembros[nMiembros - 1] = null;
        nMiembros--;
        return true;
    }

    public String listarMiembros() {
        if (nMiembros == 0) {
            return "No hay miembros registrados en la mesa.";
        }

        String lista = "";
        for (int i = 0; i < nMiembros; i++) {
            lista += (i + 1) + ". " + miembros[i] + "\n";
        }
        return lista;
    }

    public MiembroMesa[] getMiembros() {
        MiembroMesa[] copia = new MiembroMesa[nMiembros];
        for (int i = 0; i < nMiembros; i++) {
            copia[i] = miembros[i];
        }
        return copia;
    }

    public int getCantidadMiembros() {
        return nMiembros;
    }

    @Override
    public String toString() {
        return "MesaElectoral{" +
                "codigo='" + codigo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", totalVotantesHabilitados=" + totalVotantesHabilitados +
                ", nMiembros=" + nMiembros +
                '}';
    }
}