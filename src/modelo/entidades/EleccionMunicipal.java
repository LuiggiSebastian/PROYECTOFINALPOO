package modelo.entidades;

import java.util.Calendar;
import modelo.abstractas.Eleccion;
import modelo.enums.TipoEleccion;

public class EleccionMunicipal extends Eleccion {
    public EleccionMunicipal() {
        super();
        setTipoEleccion(TipoEleccion.MUNICIPAL);
    }

    public EleccionMunicipal(String codigo, String nombre, Calendar fecha, boolean activa) {
        super(codigo, nombre, fecha, activa, TipoEleccion.MUNICIPAL);
    }

    @Override
    public String toString() {
        return "EleccionMunicipal{ " + super.toString() + " }";
    }
}