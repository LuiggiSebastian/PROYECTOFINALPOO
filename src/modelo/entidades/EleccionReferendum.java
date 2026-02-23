package modelo.entidades;

import java.util.Calendar;
import modelo.abstractas.Eleccion;
import modelo.enums.TipoEleccion;

public class EleccionReferendum extends Eleccion {
    public EleccionReferendum() {
        super();
        setTipoEleccion(TipoEleccion.REFERENDUM);
    }

    public EleccionReferendum(String codigo, String nombre, Calendar fecha, boolean activa) {
        super(codigo, nombre, fecha, activa, TipoEleccion.REFERENDUM);
    }

    @Override
    public String toString() {
        return "EleccionReferendum{ " + super.toString() + " }";
    }
}