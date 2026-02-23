package modelo.gestion;

import java.util.Calendar;
import modelo.entidades.Informe;

public class GestionInforme {
    private Informe[] informes;
    private int n;

    public GestionInforme() {
        informes = new Informe[50];
        n = 0;
    }

    public int getCantidad() {
        return n;
    }

    public boolean registrarInforme(Informe i) {
        if (i == null) {
            return false;
        }

        if (n >= informes.length) {
            return false;
        }

        if (buscarInforme(i.getCodigo()) != null) {
            return false; // código repetido
        }

        informes[n] = i;
        n++;
        return true;
    }

    public Informe buscarInforme(String codigo) {
        for (int i = 0; i < n; i++) {
            if (informes[i].getCodigo().equalsIgnoreCase(codigo)) {
                return informes[i];
            }
        }
        return null;
    }

    public boolean modificarInforme(String codigo, String titulo, String contenido, Calendar fechaGeneracion) {
        Informe i = buscarInforme(codigo);

        if (i == null) {
            return false;
        }

        i.modificarDatos(titulo, contenido, fechaGeneracion);
        return true;
    }

    public boolean eliminarInforme(String codigo) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (informes[i].getCodigo().equalsIgnoreCase(codigo)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < n - 1; i++) {
            informes[i] = informes[i + 1];
        }

        informes[n - 1] = null;
        n--;
        return true;
    }

    public String listarInformes() {
        if (n == 0) {
            return "No hay informes registrados.";
        }

        String lista = "";
        for (int i = 0; i < n; i++) {
            lista += (i + 1) + ". " + informes[i] + "\n";
        }
        return lista;
    }

    public Informe[] getInformes() {
        Informe[] copia = new Informe[n];
        for (int i = 0; i < n; i++) {
            copia[i] = informes[i];
        }
        return copia;
    }
}