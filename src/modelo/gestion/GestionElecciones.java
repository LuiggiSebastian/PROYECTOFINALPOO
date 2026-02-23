package modelo.gestion;

import modelo.abstractas.Eleccion;
import modelo.entidades.EleccionMunicipal;
import modelo.entidades.EleccionNacional;
import modelo.entidades.EleccionReferendum;

import java.util.Calendar;
import modelo.abstractas.Eleccion;

public class GestionElecciones {
    private Eleccion[] elecciones;
    private int n;

    public GestionElecciones() {
        elecciones = new Eleccion[50];
        n = 0;
    }

    public int getCantidad() {
        return n;
    }

    public boolean registrarEleccion(Eleccion e) {
        if (e == null) {
            return false;
        }

        if (n >= elecciones.length) {
            return false;
        }

        if (buscarEleccion(e.getCodigo()) != null) {
            return false; // código repetido
        }

        elecciones[n] = e;
        n++;
        return true;
    }

    public Eleccion buscarEleccion(String codigo) {
        for (int i = 0; i < n; i++) {
            if (elecciones[i].getCodigo().equalsIgnoreCase(codigo)) {
                return elecciones[i];
            }
        }
        return null;
    }

    public boolean modificarEleccion(String codigo, String nombre, Calendar fecha, boolean activa) {
        Eleccion e = buscarEleccion(codigo);

        if (e == null) {
            return false;
        }

        e.modificarDatos(nombre, fecha, activa);
        return true;
    }

    public boolean eliminarEleccion(String codigo) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (elecciones[i].getCodigo().equalsIgnoreCase(codigo)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < n - 1; i++) {
            elecciones[i] = elecciones[i + 1];
        }

        elecciones[n - 1] = null;
        n--;
        return true;
    }

    public String listarElecciones() {
        if (n == 0) {
            return "No hay elecciones registradas.";
        }

        String lista = "";
        for (int i = 0; i < n; i++) {
            lista += (i + 1) + ". " + elecciones[i] + "\n";
        }
        return lista;
    }

    public Eleccion[] getElecciones() {
        Eleccion[] copia = new Eleccion[n];
        for (int i = 0; i < n; i++) {
            copia[i] = elecciones[i];
        }
        return copia;
    }
    
    public static void main(String[] args) {
        GestionElecciones ge = new GestionElecciones();

Calendar f1 = Calendar.getInstance();
f1.set(2026, Calendar.MAY, 15);

Calendar f2 = Calendar.getInstance();
f2.set(2026, Calendar.OCTOBER, 2);

Calendar f3 = Calendar.getInstance();
f3.set(2026, Calendar.NOVEMBER, 20);

System.out.println("Registrar elección municipal: " +
        ge.registrarEleccion(new EleccionMunicipal("E001", "Elección Municipal 2026", f1, true)));

System.out.println("Registrar elección nacional: " +
        ge.registrarEleccion(new EleccionNacional("E002", "Elección Nacional 2026", f2, false)));

System.out.println("Registrar referéndum: " +
        ge.registrarEleccion(new EleccionReferendum("E003", "Referéndum 2026", f3, true)));

System.out.println("\n=== LISTA DE ELECCIONES ===");
System.out.println(ge.listarElecciones());
    }
}   
