package modelo.gestion;

import modelo.entidades.MesaElectoral;
import modelo.entidades.MiembroMesa;

public class GestionMesaElectoral {
    private MesaElectoral[] mesas;
    private int n;

    public GestionMesaElectoral() {
        mesas = new MesaElectoral[50];
        n = 0;
    }

    public int getCantidad() {
        return n;
    }

    public boolean registrarMesa(MesaElectoral m) {
        if (m == null) {
            return false;
        }

        if (n >= mesas.length) {
            return false;
        }

        if (buscarMesa(m.getCodigo()) != null) {
            return false; // código repetido
        }

        mesas[n] = m;
        n++;
        return true;
    }

    public MesaElectoral buscarMesa(String codigo) {
        for (int i = 0; i < n; i++) {
            if (mesas[i].getCodigo().equalsIgnoreCase(codigo)) {
                return mesas[i];
            }
        }
        return null;
    }

    public boolean modificarMesa(String codigo, String ubicacion, int totalVotantesHabilitados) {
        MesaElectoral m = buscarMesa(codigo);

        if (m == null) {
            return false;
        }

        m.modificarDatos(ubicacion, totalVotantesHabilitados);
        return true;
    }

    public boolean eliminarMesa(String codigo) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (mesas[i].getCodigo().equalsIgnoreCase(codigo)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < n - 1; i++) {
            mesas[i] = mesas[i + 1];
        }

        mesas[n - 1] = null;
        n--;
        return true;
    }

    public boolean asignarMiembroAMesa(String codigoMesa, MiembroMesa miembro) {
        MesaElectoral mesa = buscarMesa(codigoMesa);

        if (mesa == null) {
            return false;
        }

        return mesa.registrarMiembro(miembro);
    }

    public boolean retirarMiembroDeMesa(String codigoMesa, String codigoMiembro) {
        MesaElectoral mesa = buscarMesa(codigoMesa);

        if (mesa == null) {
            return false;
        }

        return mesa.eliminarMiembro(codigoMiembro);
    }

    public String listarMesas() {
        if (n == 0) {
            return "No hay mesas registradas.";
        }

        String lista = "";
        for (int i = 0; i < n; i++) {
            lista += (i + 1) + ". " + mesas[i] + "\n";
        }
        return lista;
    }

    public MesaElectoral[] getMesas() {
        MesaElectoral[] copia = new MesaElectoral[n];
        for (int i = 0; i < n; i++) {
            copia[i] = mesas[i];
        }
        return copia;
    }
}