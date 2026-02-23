package modelo.gestion;

import modelo.entidades.ActaElectoral;

public class GestionActaElectoral {
    private ActaElectoral[] actas;
    private int n;

    public GestionActaElectoral() {
        actas = new ActaElectoral[50];
        n = 0;
    }

    public int getCantidad() {
        return n;
    }

    public boolean registrarActa(ActaElectoral a) {
        if (a == null) {
            return false;
        }

        if (n >= actas.length) {
            return false;
        }

        if (buscarActa(a.getNumeroActa()) != null) {
            return false; // número repetido
        }

        actas[n] = a;
        n++;
        return true;
    }

    public ActaElectoral buscarActa(String numeroActa) {
        for (int i = 0; i < n; i++) {
            if (actas[i].getNumeroActa().equalsIgnoreCase(numeroActa)) {
                return actas[i];
            }
        }
        return null;
    }

    public boolean modificarActa(String numeroActa, int totalVotosEmitidos, int votosValidos, int votosBlancos, int votosNulos) {
        ActaElectoral a = buscarActa(numeroActa);

        if (a == null) {
            return false;
        }

        a.modificarDatos(totalVotosEmitidos, votosValidos, votosBlancos, votosNulos);
        return true;
    }

    public boolean eliminarActa(String numeroActa) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (actas[i].getNumeroActa().equalsIgnoreCase(numeroActa)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < n - 1; i++) {
            actas[i] = actas[i + 1];
        }

        actas[n - 1] = null;
        n--;
        return true;
    }

    public boolean validarActa(String numeroActa) {
        ActaElectoral a = buscarActa(numeroActa);

        if (a == null) {
            return false;
        }

        return a.validarActa();
    }

    public String listarActas() {
        if (n == 0) {
            return "No hay actas registradas.";
        }

        String lista = "";
        for (int i = 0; i < n; i++) {
            lista += (i + 1) + ". " + actas[i] + "\n";
        }
        return lista;
    }

    public ActaElectoral[] getActas() {
        ActaElectoral[] copia = new ActaElectoral[n];
        for (int i = 0; i < n; i++) {
            copia[i] = actas[i];
        }
        return copia;
    }
}