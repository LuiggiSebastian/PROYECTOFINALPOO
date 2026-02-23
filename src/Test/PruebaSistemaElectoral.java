
package Test;



import java.util.Calendar;
import modelo.entidades.*;
import modelo.enums.TipoMiembroMesa;

public class PruebaSistemaElectoral {

    public static void main(String[] args) {

        // =========================
        // 1) Crear sistema electoral
        // =========================
        SistemaElectoral sistema = new SistemaElectoral();

        // =========================
        // 2) Registrar partidos políticos
        // =========================
        PartidoPolitico p1 = new PartidoPolitico("P01", "Partido Demo", "PD", "logo1.png", "Juan Ruiz");
        PartidoPolitico p2 = new PartidoPolitico("P02", "Avanza Ciudad", "AC", "logo2.png", "Maria Torres");

        System.out.println("Registrar partido P01: " + sistema.registrarPartido(p1));
        System.out.println("Registrar partido P02: " + sistema.registrarPartido(p2));
        System.out.println("Registrar partido duplicado P01: " + sistema.registrarPartido(p1));

        // =========================
        // 3) Registrar candidatos
        // (ajustado a tu constructor completo con votos iniciales)
        // =========================
        Candidato c1 = new Candidato("C01", 12345678, "Ana", "Perez",  0, 0,p1);
        Candidato c2 = new Candidato("C02", 23456789, "Luis", "Gomez",  0, 0,p2);

        System.out.println("Registrar candidato C01: " + sistema.registrarCandidato(c1));
        System.out.println("Registrar candidato C02: " + sistema.registrarCandidato(c2));
        System.out.println("Registrar candidato duplicado C01: " + sistema.registrarCandidato(c1));

        // =========================
        // 4) Registrar miembros de mesa
        // =========================
        MiembroMesa m1 = new MiembroMesa("MM01", 11111111, "Carlos", "Ramos", TipoMiembroMesa.PRESIDENTE);
        MiembroMesa m2 = new MiembroMesa("MM02", 22222222, "Lucia", "Vega", TipoMiembroMesa.SECRETARIO);

        System.out.println("Registrar miembro MM01: " + sistema.registrarMiembroMesa(m1));
        System.out.println("Registrar miembro MM02: " + sistema.registrarMiembroMesa(m2));

        // =========================
        // 5) Crear elección municipal
        // =========================
        Calendar fecha = Calendar.getInstance();
        fecha.set(2026, Calendar.MARCH, 15);

        EleccionMunicipal em = new EleccionMunicipal("E001", fecha);

        System.out.println("Crear elección E001: " + sistema.crearEleccion(em));
        System.out.println("Crear elección duplicada E001: " + sistema.crearEleccion(em));

        // =========================
        // 6) Agregar candidatos a la elección
        // =========================
        System.out.println("Agregar C01 a E001: " + sistema.agregarCandidatoAEleccion("E001", "C01"));
        System.out.println("Agregar C02 a E001: " + sistema.agregarCandidatoAEleccion("E001", "C02"));
        System.out.println("Agregar C01 otra vez a E001: " + sistema.agregarCandidatoAEleccion("E001", "C01"));

        // =========================
        // 7) Mostrar resumen del sistema
        // =========================
        System.out.println();
        sistema.mostrarResumenSistema();

        // =========================
        // 8) Generar resultados de la elección (sin mesas/actas aún)
        // =========================
        System.out.println();
        System.out.println("Generar resultados E001: " + sistema.generarResultadosEleccion("E001"));

        // Mostrar resultados de la elección directamente
        System.out.println();
        em.mostrarResultados();

        // =========================
        // 9) Generar informe de la elección
        // =========================
        System.out.println();
        System.out.println(sistema.generarInformeEleccion("E001"));
    }
}