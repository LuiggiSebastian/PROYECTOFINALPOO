
package modelo.abstractas;
import modelo.entidades.Candidato;
import modelo.entidades.MesaElectoral;

 import java.util.Calendar;

public abstract class Eleccion {
    private String id;
    private Calendar fecha;
    private String tipo;

    public Eleccion(String id, Calendar fecha, String tipo) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void agregarCandidato(Candidato c) {
        // TODO: implementar después
    }

    public void agregarMesa(MesaElectoral m) {
        // TODO: implementar después
    }

    public abstract void generarResultados();

    @Override
    public String toString() {
        return "Eleccion{"
                + "id=" + id
                + "\nfecha=" + fecha.get(Calendar.DAY_OF_MONTH) + "/"
                + (fecha.get(Calendar.MONTH) + 1) + "/"
                + fecha.get(Calendar.YEAR)
                + "\ntipo=" + tipo;
    }
}
    

