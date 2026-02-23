package modelo.entidades;

import java.util.Calendar;
import modelo.abstractas.Eleccion;
import modelo.enums.TipoEleccion;

public class EleccionNacional extends Eleccion {
    public EleccionNacional() {
        super();
        setTipoEleccion(TipoEleccion.NACIONAL);
    }

    public EleccionNacional(String codigo, String nombre, Calendar fecha, boolean activa) {
        super(codigo, nombre, fecha, activa, TipoEleccion.NACIONAL);
    }

    @Override
    public String toString() {
        return "EleccionNacional{ " + super.toString() + " }";
    }
}
