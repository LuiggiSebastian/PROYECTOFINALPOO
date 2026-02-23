package modelo.gestion;

import modelo.entidades.PartidoPolitico;

public class GestionPartido {
    private PartidoPolitico[] partidos;
    private int n;

    public GestionPartido() {
        partidos = new PartidoPolitico[50];
        n = 0;
    }

    public int getCantidad() {
        return n;
    }

    public boolean registrarPartido(PartidoPolitico p) {
        if (p == null) {
            return false;
        }

        if (n >= partidos.length) {
            return false;
        }

        if (buscarPartido(p.getCodigo()) != null) {
            return false; // código repetido
        }

        partidos[n] = p;
        n++;
        return true;
    }

    public PartidoPolitico buscarPartido(String codigo) {
        for (int i = 0; i < n; i++) {
            if (partidos[i].getCodigo().equalsIgnoreCase(codigo)) {
                return partidos[i];
            }
        }
        return null;
    }

    public boolean modificarPartido(String codigo, String nombre, String sigla, String logo, String representanteLegal) {
        PartidoPolitico p = buscarPartido(codigo);

        if (p == null) {
            return false;
        }

        p.modificarDatos(nombre, sigla, logo, representanteLegal);
        return true;
    }

    public boolean eliminarPartido(String codigo) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (partidos[i].getCodigo().equalsIgnoreCase(codigo)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < n - 1; i++) {
            partidos[i] = partidos[i + 1];
        }

        partidos[n - 1] = null;
        n--;
        return true;
    }

    public String listarPartidos() {
        if (n == 0) {
            return "No hay partidos registrados.";
        }

        String lista = "";
        for (int i = 0; i < n; i++) {
            lista += (i + 1) + ". " + partidos[i] + "\n";
        }
        return lista;
    }

    // Útil para GUI (por ejemplo JTable)
    public PartidoPolitico[] getPartidos() {
        PartidoPolitico[] copia = new PartidoPolitico[n];
        for (int i = 0; i < n; i++) {
            copia[i] = partidos[i];
        }
        return copia;
    }
}