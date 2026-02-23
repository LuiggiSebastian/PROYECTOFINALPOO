package modelo.gestion;

import modelo.entidades.Operador;

public class GestionOperador {
    private Operador[] operadores;
    private int n;

    public GestionOperador() {
        operadores = new Operador[50];
        n = 0;
    }

    public int getCantidad() {
        return n;
    }

    public boolean registrarOperador(Operador o) {
        if (o == null) {
            return false;
        }

        if (n >= operadores.length) {
            return false;
        }

        if (buscarOperadorPorUsername(o.getUsername()) != null) {
            return false; // username repetido
        }

        operadores[n] = o;
        n++;
        return true;
    }

    public Operador buscarOperadorPorUsername(String username) {
        for (int i = 0; i < n; i++) {
            if (operadores[i].getUsername().equalsIgnoreCase(username)) {
                return operadores[i];
            }
        }
        return null;
    }

    public boolean eliminarOperador(String username) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (operadores[i].getUsername().equalsIgnoreCase(username)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < n - 1; i++) {
            operadores[i] = operadores[i + 1];
        }

        operadores[n - 1] = null;
        n--;
        return true;
    }

    public Operador autenticar(String username, String password) {
        Operador op = buscarOperadorPorUsername(username);

        if (op != null && op.autenticar(username, password)) {
            return op;
        }
        return null;
    }

    public String listarOperadores() {
        if (n == 0) {
            return "No hay operadores registrados.";
        }

        String lista = "";
        for (int i = 0; i < n; i++) {
            lista += (i + 1) + ". " + operadores[i] + "\n";
        }
        return lista;
    }

    public Operador[] getOperadores() {
        Operador[] copia = new Operador[n];
        for (int i = 0; i < n; i++) {
            copia[i] = operadores[i];
        }
        return copia;
    }
}