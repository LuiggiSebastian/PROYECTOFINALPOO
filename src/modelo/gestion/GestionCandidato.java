package modelo.gestion;

import modelo.entidades.Candidato;

public class GestionCandidato {
    private Candidato[] candidatos;
    private int n;

    public GestionCandidato() {
        candidatos = new Candidato[50];
        n = 0;
    }

    public int getCantidad() {
        return n;
    }

    public boolean registrarCandidato(Candidato c) {
        if (c == null) {
            return false;
        }

        if (n >= candidatos.length) {
            return false;
        }

        if (buscarCandidato(c.getCodigo()) != null) {
            return false; // código repetido
        }

        candidatos[n] = c;
        n++;
        return true;
    }

    public Candidato buscarCandidato(String codigo) {
        for (int i = 0; i < n; i++) {
            if (candidatos[i].getCodigo().equalsIgnoreCase(codigo)) {
                return candidatos[i];
            }
        }
        return null;
    }

    public boolean modificarCandidato(String codigo, String nombre, String apellido) {
        Candidato c = buscarCandidato(codigo);

        if (c == null) {
            return false;
        }

        c.modificarDatos(nombre, apellido);
        return true;
    }

    public boolean eliminarCandidato(String codigo) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (candidatos[i].getCodigo().equalsIgnoreCase(codigo)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < n - 1; i++) {
            candidatos[i] = candidatos[i + 1];
        }

        candidatos[n - 1] = null;
        n--;
        return true;
    }

    public String listarCandidatos() {
        if (n == 0) {
            return "No hay candidatos registrados.";
        }

        String lista = "";
        for (int i = 0; i < n; i++) {
            lista += (i + 1) + ". " + candidatos[i] + "\n";
        }
        return lista;
    }

    // Útil para GUI (por ejemplo JTable)
    public Candidato[] getCandidatos() {
        Candidato[] copia = new Candidato[n];
        for (int i = 0; i < n; i++) {
            copia[i] = candidatos[i];
        }
        return copia;
    }
}
