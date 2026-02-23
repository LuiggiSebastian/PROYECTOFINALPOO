
package Test;
import modelo.entidades.*;

import java.util.Calendar;
import modelo.enums.TipoMiembroMesa;

public class PruebaEleccionMunicipal {

    public static void main(String[] args) {

        // =========================
        // 1) Crear partidos políticos
        // =========================
        PartidoPolitico p1 = new PartidoPolitico("P01", "Partido Demo", "PD", "logo1.png", "Juan Ruiz");
        PartidoPolitico p2 = new PartidoPolitico("P02", "Avanza Ciudad", "AC", "logo2.png", "Maria Torres");

        // =========================
        // 2) Crear candidatos
        // =========================
      Candidato c1 = new Candidato("C01", 12345678, "Ana", "Perez",  0, 0,p1);
Candidato c2 = new Candidato("C02", 23456789, "Luis", "Gomez",  0, 0,p2);
        // =========================
        // 3) Crear elección municipal
        // =========================
        Calendar fechaEleccion = Calendar.getInstance();
        fechaEleccion.set(2026, Calendar.MARCH, 15); // 15/03/2026

        EleccionMunicipal eleccion = new EleccionMunicipal("E001", fechaEleccion);

        eleccion.agregarCandidato(c1);
        eleccion.agregarCandidato(c2);

        // =========================
        // 4) Crear mesa y miembros
        // =========================
        MesaElectoral mesa1 = new MesaElectoral("M001", "Colegio San Martín", 300);

        MiembroMesa m1 = new MiembroMesa("MM01", 11111111, "Carlos", "Ramos", TipoMiembroMesa.PRESIDENTE);
        MiembroMesa m2 = new MiembroMesa("MM02", 22222222, "Lucia", "Vega", TipoMiembroMesa.SECRETARIO);
        MiembroMesa m3 = new MiembroMesa("MM03", 33333333, "Pedro", "Diaz", TipoMiembroMesa.VOCAL);

        mesa1.asignarMiembro(m1);
        mesa1.asignarMiembro(m2);
        mesa1.asignarMiembro(m3);

        // =========================
        // 5) Crear acta electoral y registrar votos
        // =========================
        ActaElectoral acta1 = new ActaElectoral(
                "A001",
                "Acta de Sufragio Mesa M001",
                "15/03/2026",
                "18:30",
                "Colegio San Martín",
                300,   // votantes registrados
                250,   // votantes efectivos
                10,    // votos en blanco
                5,     // votos nulos
                "Sin observaciones",
                "Firmas completas",
                true
        );

        // Registrar votos por candidato
        acta1.registrarVoto(c1, 120);
        acta1.registrarVotoPreferencial(c1, 30);

        acta1.registrarVoto(c2, 115);
        acta1.registrarVotoPreferencial(c2, 25);

        // Vincular acta a mesa
        mesa1.registrarActa(acta1);

        // Vincular mesa a elección
        eleccion.agregarMesa(mesa1);

        // =========================
        // 6) Generar resultados de la elección
        // =========================
        eleccion.generarResultados();

        // =========================
        // 7) Mostrar resultados
        // =========================
        eleccion.mostrarResultados();

        // =========================
        // 8) Mostrar resumen del acta (opcional)
        // =========================
        System.out.println();
        acta1.mostrarResumenActa();

        // =========================
        // 9) Mostrar informe (si implementaste generarInforme en EleccionMunicipal)
        // =========================
        System.out.println();
        System.out.println(eleccion.generarInforme());
    }
}
